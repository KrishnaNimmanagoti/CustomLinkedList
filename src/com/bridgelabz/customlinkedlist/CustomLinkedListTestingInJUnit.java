package com.bridgelabz.customlinkedlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomLinkedListTestingInJUnit {

    CustomLinkedList<Object> customLinkedList;

    @Test
    public void search() {
        customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.add(56);
        customLinkedList.addAtFirst(33);
        customLinkedList.viewList();
        Assertions.assertTrue(customLinkedList.search(56));
    }

    @Test
    public void placeElementAfterProvidedElementTest() {
        customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.add(56);
        customLinkedList.addAtFirst(23);
        Assertions.assertEquals(true, customLinkedList.placeElementAfterProvidedElement(30, 31));
        customLinkedList.viewList();
    }
}
