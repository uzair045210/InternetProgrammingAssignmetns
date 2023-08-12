package org.java.genericShapeList;

import org.code.genericShapeList.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GenericShapeAutoIdTest {
    private ShapeList shapeList;

    @Before
    public void setUp() {
        shapeList = new ShapeList();
    }
    @Test
    public void testIdAndCreationTime() {
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(3, 4);
        Shape triangle = new Triangle(6, 8);

        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(triangle);

        assertTrue(square.getId() < rectangle.getId());
        assertTrue(rectangle.getId() < triangle.getId());
        assertNotNull(square.getCreation());
        assertNotNull(rectangle.getCreation());
        assertNotNull(triangle.getCreation());
    }
}
