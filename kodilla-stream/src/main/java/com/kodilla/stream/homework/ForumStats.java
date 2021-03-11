package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(un -> un.getNumberOfPost())
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);

        avg = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(un -> un.getNumberOfPost())
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
