package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) throws InvalidNumbersException {
        String text = "12 45 32 26 1 5";
        String[] numbersAsString = text.split(" ");
        Set<Integer> numbers = new HashSet<>();
        for (String number :
             numbersAsString) {
            System.out.println(number);
            numbers.add(Integer.parseInt(number));
        }
        for (Integer number :
             numbers) {
            System.out.println(number);
        }


//        GamblingMachine gamblingMachine = new GamblingMachine();
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(2);
//        numbers.add(15);
//        numbers.add(35);
//        numbers.add(24);
//        numbers.add(12);
//        numbers.add(28);
//        int i = 0;
//        int succses = 0;
//        while (gamblingMachine.howManyWins(numbers) < 5) {
//            i++;
//        }
//        System.out.println(i);
    }
}
