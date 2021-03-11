package com.bridgelabz.customlinkedlist;

public class CustomLinkedList {
    int size;
    Node start;

    public CustomLinkedList() {
        this.size = 0;
        this.start = null;
    }

    public boolean isEmpty() {
        return (start == null) ? true : false;
    }

    public int getSize() {
        return size;
    }
}
