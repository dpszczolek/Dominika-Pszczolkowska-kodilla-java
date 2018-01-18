package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Starting tests.");
    }
    @AfterClass
    public static void afterAllClass () {
        System.out.println("Finished tests.");
    }
    @Before
    public void beforeEveryTest () {
        testCounter++;
        System.out.println("Starting test # " + testCounter);
    }
    @Test
    public void testAddFigure () {
        Shape circle = new Circle ("circle", 2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        Shape actualShape = shapeCollector.getFigure(0);
        Assert.assertEquals(circle,actualShape);
    }
    @Test
    public void testFigureQuantity () {
        Shape circle = new Circle ("circle", 2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }
    @Test
    public void testRemoveFigure() {
        Shape circle = new Circle ("circle", 2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        boolean result = shapeCollector.removeFigure(circle);
        Assert.assertFalse(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }
    @Test
    public void testShowFigures () {
        Shape circle = new Circle ("circle", 2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        String figuresList = shapeCollector.showFigures();
        Assert.assertEquals(figuresList, circle.toString());
    }
}
