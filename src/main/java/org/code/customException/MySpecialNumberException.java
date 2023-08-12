package org.code.customException;

public class MySpecialNumberException extends Exception {
    public MySpecialNumberException() {

    }

    public MySpecialNumberException(String message) {
        super(message);
    }

    public MySpecialNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
