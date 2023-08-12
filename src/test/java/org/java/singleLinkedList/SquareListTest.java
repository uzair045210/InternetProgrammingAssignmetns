package org.java.singleLinkedList;

import org.code.singleLinkedList.Square;
import org.code.singleLinkedList.SquareList;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SquareListTest {
    private SquareList squareList;

    @Before
    public void setUp() {
        squareList = new SquareList();
    }

    @Test
    public void testAdd() {
        Square square1 = new Square(5); // Create a Square object with side length 5
        squareList.add(square1);

        assertEquals(1, squareList.getSize()); // Assuming you have a getSize() method
    }

    @Test
    public void testRemove() {
        Square square1 = new Square(5);
        squareList.add(square1);

        squareList.remove();

        assertTrue(squareList.isEmpty());
    }

}
