package com.bridgelabz.customlinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
   public Stack stack = new Stack();

    @Test
    public void pushTest() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    }
}


