package com.kodilla.kodillapatterns3.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTasksTestSuite {

    @Test
    public void testTasks() {
        // Given
        StudentTasks student1 = new StudentTasks();
        StudentTasks student2 = new StudentTasks();
        Mentor jacekO = new Mentor("Jacek");
        Mentor krzysiekT = new Mentor("Krzysiek");
        student1.registerObserver(jacekO);
        student2.registerObserver(krzysiekT);
        // When
        student1.addTask("Task 10.1");
        student2.addTask("Task 8.3");
        student1.addTask("Task 10.2");
        student1.addTask("Task 10.5");
        student2.addTask("Task 8.5");
        student1.addTask("Task 11.1");
        // Then
        assertEquals(4,jacekO.getUpdateCount());
        assertEquals(2,krzysiekT.getUpdateCount());
    }
}
