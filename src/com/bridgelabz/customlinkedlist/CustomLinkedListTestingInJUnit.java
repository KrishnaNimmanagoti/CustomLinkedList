package com.bridgelabz.customlinkedlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomLinkedListTestingInJUnit {

    CustomLinkedList<Integer> customLinkedList;

    @BeforeEach
    public void setup() {
        customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.add(44);
        customLinkedList.add(66);
        customLinkedList.add(77);
        customLinkedList.add(88);
        customLinkedList.add(99);
    }

    @Test
    public void search() {
        customLinkedList.addAtFirst(33);
        customLinkedList.viewList();
        Assertions.assertTrue(customLinkedList.search(56));
    }

    @Test
    public void placeElementAfterProvidedElementTest() {
        customLinkedList.addAtFirst(23);
        Assertions.assertTrue(customLinkedList.placeElementAfterProvidedElement(30, 31));
        customLinkedList.viewList();
    }

    @Test
    public void deleteTest() {
        Assertions.assertTrue(customLinkedList.delete(3));
        customLinkedList.delete(44);
        customLinkedList.viewList();
    }
}
