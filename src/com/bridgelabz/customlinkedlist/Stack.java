package com.bridgelabz.customlinkedlist;

public class Stack<T extends Comparable <T>> {
    CustomLinkedList<T> stack;
    public Stack() {
        stack = new CustomLinkedList<>();
    }

    public void push(T data){
       stack.add(data);
       stack.viewList();
    }
}
