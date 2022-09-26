package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given
        int[] numbers = new int[]{ 52, 41, 100, 29, 78, 34, 40, 51, 5, 33, 94, 98, 65, 32, 11, 71, 18, 35, 2, 23 };

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(45.6, result, 0.0001);

    }
}
