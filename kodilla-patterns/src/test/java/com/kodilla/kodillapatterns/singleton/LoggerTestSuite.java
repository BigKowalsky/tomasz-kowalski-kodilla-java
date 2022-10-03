package com.kodilla.kodillapatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        logger.log("user1989abc.01");
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("user1989abc.01", result);
    }
}
