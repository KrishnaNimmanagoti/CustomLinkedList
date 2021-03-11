package com.bridgelabz.customlinkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Object> customLinkedList = new CustomLinkedList<>();

        customLinkedList.addAtFirst(70);
        customLinkedList.addAtFirst(30);
        customLinkedList.addAtFirst(56);
        customLinkedList.addAtFirst(20.43);

        customLinkedList.viewList();
    }

}
