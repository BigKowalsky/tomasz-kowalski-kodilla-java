package com.kodilla.kodillapatterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factoryShopping = new TaskFactory();
        //When
        Task shopping = factoryShopping.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals(shopping.getTaskName(), "Buying painting utilities");
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factoryPainting = new TaskFactory();
        //When
        Task painting = factoryPainting.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals(painting.getTaskName(), "Painting a landscape");
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factoryDriving = new TaskFactory();
        //When
        Task driving = factoryDriving.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals(driving.getTaskName(), "Giving a painting");
        assertFalse(driving.isTaskExecuted());
    }
}
