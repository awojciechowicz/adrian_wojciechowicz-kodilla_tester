package com.kodilla.collections.adv.immutable.homework;

public class NextTask extends Task{
    private String newTitle;

    public NextTask(String title, int duration) {
        super(title, duration);
        newTitle = title;
    }

    public void changeTitle(String changedTitle) {
        newTitle = changedTitle;
    }

    @Override
    public String getTitle() {
        return newTitle;
    }
}
