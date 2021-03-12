package com.bridgelabz.customlinkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();

        customLinkedList.insertInOrder(70);
        customLinkedList.insertInOrder(30);
        customLinkedList.insertInOrder(44);
        customLinkedList.insertInOrder(66);
        customLinkedList.insertInOrder(77);
        customLinkedList.insertInOrder(88);
        customLinkedList.insertInOrder(99);
        
        customLinkedList.viewList();
    }

}
