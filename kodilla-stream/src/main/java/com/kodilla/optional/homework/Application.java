package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", new Teacher("Mr. O'Shack Hennessy")));
        students.add(new Student("Christopher", new Teacher("Mrs. Smith")));
        students.add(new Student("Jacob", null));
        students.add(new Student("Denise", new Teacher("Mrs. Samuel")));
        students.add(new Student("Lisa", null));
        students.add(new Student("Balake", new Teacher("Mr. Garvey")));


        for (Student student :
             students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teachername =
                    optionalTeacher.orElse(new Teacher("<undefined>"));

            System.out.println("student: " + student.getName() + ", teacher: " + teachername.getName());
        }
    }
}
