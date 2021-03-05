package com.kodilla.collections.adv.immutable.homework;

public class Application {
    public static void main(String[] args) {
        Task task = new NextTask("First one", 3);
        NextTask nextTask = (NextTask) task;
        nextTask.changeTitle("First changed");
        System.out.println(task.getTitle() + ": " + task.duration);
    }
}
