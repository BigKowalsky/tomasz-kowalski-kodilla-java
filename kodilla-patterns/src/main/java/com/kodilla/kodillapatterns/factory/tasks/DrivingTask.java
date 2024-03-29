package com.kodilla.kodillapatterns.factory.tasks;

import java.time.Duration;
import java.time.LocalDate;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    LocalDate today = LocalDate.now();
    LocalDate finish = LocalDate.of(2022,10,31);


    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }


    @Override
    public void executeTask() {
        System.out.println(taskName + " to : " + where + " by: " + using);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean result = false;
        if (finish.isBefore(today.plusDays(15))) {
            result = true;
        }
        return result;
    }
}
