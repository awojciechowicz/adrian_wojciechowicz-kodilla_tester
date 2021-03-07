package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book mobyDick = BookManager.createBook("Moby Dick", "Herman Melville");
        Book aroundTheWorldInEightyDays = BookManager.createBook("Around the World in Eighty Days", "Jules Verne");
        Book mobyDick1 = BookManager.createBook("Moby Dick", "Herman Melville");
        Book crimeAndPunishment = BookManager.createBook("Crime and Punishment", "Fyodor Dostoevsky");
        Book mobyDick2 = BookManager.createBook("Moby Dick", "Herman Melville");
    }
}
