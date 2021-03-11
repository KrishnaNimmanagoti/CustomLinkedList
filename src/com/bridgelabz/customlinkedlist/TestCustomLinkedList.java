package com.bridgelabz.customlinkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Object> customLinkedList = new CustomLinkedList<>();

        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.add(56);
        customLinkedList.add("krish");
        customLinkedList.addAtPosition(20.43, 2);

        customLinkedList.viewList();
    }

}
