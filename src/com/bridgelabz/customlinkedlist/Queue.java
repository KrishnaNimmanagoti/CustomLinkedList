package com.bridgelabz.customlinkedlist;

public class Queue<T extends Comparable <T>> {

    CustomLinkedList<T> queue;

    public Queue(){
        queue = new CustomLinkedList<>();
    }
    public void push(T value){
        queue.add(value);
    }
    public T pop(){
        return queue.deleteFirst();
    }
}