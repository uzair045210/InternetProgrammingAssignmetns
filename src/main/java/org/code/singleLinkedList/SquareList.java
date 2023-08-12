package org.code.singleLinkedList;

public class SquareList {
    private class Node {
        public Square data;
        public Node next;

        public Node(Square data) {
            this.data = data;
        }
    }

    private Node root;
    private int size;

    public SquareList() {
        root = null;
        size = 0;
    }

    public void add(Square square) {
        Node newNode = new Node(square);
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
