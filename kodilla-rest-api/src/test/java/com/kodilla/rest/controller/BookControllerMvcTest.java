package com.kodilla.rest.controller;

import com.google.gson.*;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;


@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)                   // [1]
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldFetchBooks() throws Exception {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books")                      // [1]
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))                     // [2]
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].title", Matchers.is("title 1")));

    }

    @Test
    public void shouldAddBooks() throws Exception {
        //given
//        List<BookDto> booksList = new ArrayList<>();
//        booksList.add(new BookDto("title 1", "author 1"));
//        booksList.add(new BookDto("title 2", "author 2"));
//        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        Gson gson = new Gson();
        BookDto book = new BookDto("title 1", "author 1");
        String json = gson.toJson(book);
        System.out.println(json);
        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(MockMvcResultMatchers.status().is(200));
        Mockito.verify(bookService,Mockito.times(1)).addBook(book);
    }

}