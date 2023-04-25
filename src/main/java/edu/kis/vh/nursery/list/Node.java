package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev;
    private Node next;

    protected Node(int i) {
        value = i;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
