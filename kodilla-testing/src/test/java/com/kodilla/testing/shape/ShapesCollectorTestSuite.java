package com.kodilla.testing.shape;

import com.kodilla.testing.Shape.ShapeCollector;
import com.kodilla.testing.Shape.Triangle;
import com.kodilla.testing.Shape.Shape;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapesCollectorTestSuite {

    @Before
    public void beforeTest() {
        System.out.println("Start test");
    }

    @After
    public void afterTest() {
        System.out.println("End test");
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle("Triangle1", 12, 13, 22);
        shapeCollector.addFigure(triangle1);
        Assert.assertEquals(1, shapeCollector.getShapes().size());
    }
    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle("Triangle1", 12, 13, 22);
        Triangle triangle2 = new Triangle("Triangle2", 5, 20, 14);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(triangle2);
        shapeCollector.removeFigure(triangle2);
        Assert.assertEquals(1, shapeCollector.getShapes().size());
    }
    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle1 = new Triangle("Triangle1", 12, 13, 22);
        Triangle triangle2 = new Triangle("Triangle2", 5, 20, 14);
        Triangle triangle3 = new Triangle("Triangle3", 9, 20, 25);

        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(triangle2);
        shapeCollector.addFigure(triangle3);

        Shape result = shapeCollector.getFigure(2);
        Assert.assertEquals(triangle3, result);
    }
}
