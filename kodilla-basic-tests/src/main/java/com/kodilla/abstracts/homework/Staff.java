package com.kodilla.abstracts.homework;

public class Staff {
    public static void main(String[] args) {
        Person andrew = new Person("Andrew", 35, new Tester(3000, "writes tests"));
        Person michael = new Person("Michael", 43, new Manager(4000, "performs risk management"));
        Person john = new Person("John", 30, new Tester(3500, "implements software programs"));

        Person[] employee = {andrew, michael, john};

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFirstName());
            System.out.println(employee[i].getAge());
            System.out.println(employee[i].getJob().getSalary());
            System.out.println(employee[i].getJob().getResponsibilities());
        }
    }
}
