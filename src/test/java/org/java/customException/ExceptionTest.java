package org.java.customException;

import org.code.customException.MySpecialNumberException;
import org.junit.Test;

import java.io.IOException;

public class ExceptionTest {
    public void myFunc(int x) throws MySpecialNumberException {
        if (x == 10 || x == 20 || x == 30)
            throw new MySpecialNumberException("Input cannot be 10, 20 or 30", new Throwable());
    }

    @Test
    public void testException() {
        int[] inputs = { 5, 10, 15, 20, 25, 30 };
        for (int input : inputs) {
            try {
                myFunc(input);
                System.out.println("myFunc(" + input + ") completed successfully.");
            } catch (MySpecialNumberException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Cleanup or final actions can be performed here.");
            }
        }
    }

}
