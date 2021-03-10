package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Requirements", LocalDate.of(2021,01,01), LocalDate.of(2021,01,10)));
        tasks.add(new Task("Design", LocalDate.of(2021,01,11), LocalDate.of(2021,02,28)));
        tasks.add(new Task("Implementation", LocalDate.of(2021,03,01), LocalDate.of(2021,03,15)));
        tasks.add(new Task("Verification", LocalDate.of(2021,02,15), LocalDate.of(2021,04,30)));
        tasks.add(new Task("Maintrance", LocalDate.of(2021,04,01), LocalDate.of(2021,06,30)));
        return tasks;
    }
}
