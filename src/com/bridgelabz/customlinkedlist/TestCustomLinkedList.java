package com.bridgelabz.customlinkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Object> customLinkedList = new CustomLinkedList<>();

        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.add(44);
        customLinkedList.add(66);
        customLinkedList.add(77);
        customLinkedList.add(88);
        customLinkedList.add(99);

        customLinkedList.delete(3);
        customLinkedList.delete(44);

        customLinkedList.viewList();
    }

}
