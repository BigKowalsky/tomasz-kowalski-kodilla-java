package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test case: start");
    }
    @AfterEach
            public void after() {
        System.out.println("Test case: end");
    }
    @DisplayName(
            "When list is empty, " +
             "then class works properly"
    )

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> numberList = OddNumberExterminator.exterminate(emptyList);
        System.out.println("Testing " + numberList);
        //Then
        Assertions.assertEquals(emptyList, numberList);
    }
    @DisplayName(
            "When list contains odd numbers and even numbers, " +
                    "then class works properly"
    )
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 35, 48 ,77, 79, 154, 199, 202, 205));
        ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(10, 48, 154, 202));
        //When
        ArrayList<Integer> numberList = OddNumberExterminator.exterminate(list);
        System.out.println("Testing " + numberList);
        //Then
        Assertions.assertEquals(oddList,numberList);
    }

}
