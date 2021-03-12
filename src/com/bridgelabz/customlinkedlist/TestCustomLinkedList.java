package com.bridgelabz.customlinkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Object> customLinkedList = new CustomLinkedList<>();

        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.add(44);
        customLinkedList.add(66);
        customLinkedList.addAtPosition(22,2);
        customLinkedList.placeElementAfterProvidedElement(44, 45);
        customLinkedList.viewList();
    }

}
