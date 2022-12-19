package com.kodilla.kodillapatterns3.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(mentorName + ": New student's task: " + "\n" +
                " (You have got: " + studentTasks.getTasks().size() + " tasks to check:)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
