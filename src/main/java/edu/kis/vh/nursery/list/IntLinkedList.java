package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int NEGATIVE_VALUE = -1;
    private Node last;
    private int i;

    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        protected Node(int i) {
            value = i;
        }

        private int getValue() {
            return value;
        }

        private Node getPrev() {
            return prev;
        }

        private void setPrev(Node prev) {
            this.prev = prev;
        }

        private Node getNext() {
            return next;
        }

        private void setNext(Node next) {
            this.next = next;
        }
    }

    protected void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    protected boolean isEmpty() {
        return last == null;
    }

    protected boolean isFull() {
        return false;
    }

    protected int top() {
        if (isEmpty())
            return NEGATIVE_VALUE;
        return last.getValue();
    }

    protected int pop() {
        if (isEmpty())
            return NEGATIVE_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
