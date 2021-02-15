package Modul_2;

public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title) {
        Book bookExample = new Book();
        bookExample.author = author;
        bookExample.title = title;
        return bookExample;
    }
}
