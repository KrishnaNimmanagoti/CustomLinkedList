package com.bridgelabz.customlinkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();

        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.addAtFirst(44);
        customLinkedList.addAtPosition(59, 2);
        customLinkedList.add(77);
        customLinkedList.add(88);
        customLinkedList.add(99);
        
        customLinkedList.viewList();
    }

}
