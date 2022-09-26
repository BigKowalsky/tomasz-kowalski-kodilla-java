package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void before(){
        System.out.println("Tests: start");
    }

    @AfterAll
    public static void after(){
        System.out.println("Tests: finish");
    }

    @Nested
    class FigureAddingAndRemoving {
        @DisplayName("Add figure test.")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(25);
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(1, shapeCollector.getCollection().size());
        }

        @DisplayName("Remove figure test.")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(16);
            //When
            shapeCollector.addFigure(square);
            shapeCollector.removeFigure(square);
            //Then
            Assertions.assertEquals(0,shapeCollector.getCollection().size());
        }
    }

    @Nested
    class FigureInfo {
        @DisplayName("Get figure test.")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(10);
            shapeCollector.addFigure(square);
            //When
            Shape result = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(square, result);
        }

        @DisplayName("Show figure test")
        @Test
        void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(20, 15);
            Shape square = new Square(14);
            Shape circle = new Circle(10);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            ArrayList<Shape> basiclist = new ArrayList<>();
            basiclist.add(triangle);
            basiclist.add(square);
            basiclist.add(circle);
            //When
            String shapes = basiclist.toString();
            String figures = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(shapes,figures);
        }
    }
}
