package com.bridgelabz.customlinkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Object> customLinkedList = new CustomLinkedList<>();

        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.add(56);
        customLinkedList.addAtFirst(33);
        customLinkedList.search(56);
        customLinkedList.viewList();
    }

}
