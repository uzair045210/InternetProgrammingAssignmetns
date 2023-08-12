package org.java.genericShapeList;

import org.code.genericShapeList.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeListTest {
    private ShapeList shapeList;

    @Before
    public void setUp() {
        shapeList = new ShapeList();
    }

    @Test
    public void testAdd() {
        Shape square = new Square(5);
        shapeList.add(square);

        assertEquals(1, shapeList.getSize());
    }

    @Test
    public void testRemove() {
        Shape square = new Square(5);
        shapeList.add(square);

        shapeList.remove();

        assertTrue(shapeList.isEmpty());
    }

    @Test
    public void testAddAndSize() {
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(3, 4);
        Shape triangle = new Triangle(6, 8);

        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(triangle);

        assertEquals(3, shapeList.getSize());
    }

    @Test
    public void testRemoveAndEmpty() {
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(3, 4);

        shapeList.add(square);
        shapeList.add(rectangle);

        shapeList.remove();
        shapeList.remove();

        assertTrue(shapeList.isEmpty());
    }

}