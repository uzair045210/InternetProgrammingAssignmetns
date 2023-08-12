package org.code.genericShapeList;

import java.time.LocalDateTime;

public abstract class Shape {
    private static int nextId = 1;

    private int id;
    private LocalDateTime creation;

    public Shape() {
        id = nextId++;
        creation = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public abstract void draw();
}
