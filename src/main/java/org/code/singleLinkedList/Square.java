package org.code.singleLinkedList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Square {
    private long length;
    private LocalDateTime creation;

    public Square() {
        creation = LocalDateTime.now();
    }

    public Square(long length) {
        this.length = length;
        creation = LocalDateTime.now();
    }

    public long getArea() {
        return length * length;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "(" + length +
                ", " + getArea() +
                ", " + creation.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                ")";
    }
}
