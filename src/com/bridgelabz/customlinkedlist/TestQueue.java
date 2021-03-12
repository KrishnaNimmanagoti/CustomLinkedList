package com.bridgelabz.customlinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueue {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
        queue.push(45);
        queue.push(43);
        queue.push(23);
    }

    @Test
    public void testPop() {
        int result ;
        result = (int) queue.pop();
        System.out.println(result);
        Assertions.assertEquals(58, result);
    }

    @Test
    public void searchTest() {
        Assertions.assertTrue(queue.search(56));
    }

    @Test
    public void deleteTest() {
        Assertions.assertTrue(queue.delete(3));
        queue.delete(44);
        queue.viewList();
    }

}
