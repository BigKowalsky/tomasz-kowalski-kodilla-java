package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theFirstUser");

        String result = simpleUser.getUsername();

        if (result.equals("theFirstUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator myCalculator = new Calculator();

        int a = 8;
        int b = 6;

        int sumResult = myCalculator.add(a, b);
        if(sumResult == a + b) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int differenceResult = myCalculator.substract(a,b);
        if(differenceResult == a - b) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        }
    }