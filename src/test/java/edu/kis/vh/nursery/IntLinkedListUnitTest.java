package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class IntLinkedListUnitTest {
    @Test
    void push() {
        IntLinkedList list = new IntLinkedList();
        list.push(1);
        list.push(2);
        assertEquals(2, list.pop());
        assertEquals(1, list.pop());
        assertTrue(list.isEmpty());
    }

    @Test
    void isEmpty() {
        IntLinkedList list = new IntLinkedList();
        assertTrue(list.isEmpty());
        list.push(1);
        assertFalse(list.isEmpty());
    }

    @Test
    void isFull() {
        IntLinkedList list = new IntLinkedList();
        assertFalse(list.isFull());
    }

    @Test
    void top() {
        IntLinkedList list = new IntLinkedList();
        assertEquals(-1, list.top());
        list.push(1);
        assertEquals(1, list.top());
        list.push(2);
        assertEquals(2, list.top());
    }

    @Test
    void pop() {
        IntLinkedList list = new IntLinkedList();
        assertEquals(-1, list.pop());
        list.push(2);
        assertEquals(2, list.pop());
        assertTrue(list.isEmpty());
    }
}
