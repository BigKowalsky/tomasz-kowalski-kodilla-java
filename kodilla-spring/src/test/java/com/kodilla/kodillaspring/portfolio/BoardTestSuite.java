package com.kodilla.kodillaspring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().tasks.add("Learn Maths.");
        board.getInProgressList().tasks.add("Write an article.");
        board.getDoneList().tasks.add("Bake a cake.");
        //Then
        assertEquals("Learn Maths.", board.getToDoList().getTasks().get(0));
        assertEquals("Write an article.", board.getInProgressList().getTasks().get(0));
        assertEquals("Bake a cake.", board.getDoneList().getTasks().get(0));
    }
}
