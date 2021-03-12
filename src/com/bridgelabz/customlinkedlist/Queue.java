package com.bridgelabz.customlinkedlist;

import org.junit.jupiter.api.Test;

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
    public boolean search(T value) {
        return queue.search(value);
    }
    public boolean placeElementAfterProvidedElement(T keyValue, T placeValue) {
        return queue.placeElementAfterProvidedElement(keyValue, placeValue);
    }
    public boolean delete(T value) {
        return queue.delete(value);
    }
    public void viewList() {
        queue.viewList();
    }
}