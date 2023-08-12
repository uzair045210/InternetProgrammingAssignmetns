package org.code.genericShapeList;

public class ShapeList {
    private class Node {
        public Shape data;
        public Node next;

        public Node(Shape data) {
            this.data = data;
        }
    }

    private Node root;
    private int size;

    public void add(Shape shape) {
        Node newNode = new Node(shape);
        if (isEmpty())
            root = newNode;
        else {
            Node temp = root;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public void remove() {
        if (isEmpty())
            return;
        if (root.next == null)
            root = null;
        else {
            Node temp = root, prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node temp = root;
        System.out.println("{");
        while (temp != null) {
            System.out.println("\t" + temp.data);
            temp = temp.next;
        }
        System.out.println("}");
    }
}
