package com.bridgelabz.customlinkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Object> customLinkedList = new CustomLinkedList<>();

        customLinkedList.add(70);
        customLinkedList.add('k');
        customLinkedList.add("krish");
        customLinkedList.add(20.43);

        customLinkedList.viewList();
    }

}
