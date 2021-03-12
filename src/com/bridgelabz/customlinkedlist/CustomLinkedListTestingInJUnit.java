package com.bridgelabz.customlinkedlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomLinkedListTestingInJUnit {



    @Test
    public void search() {

        CustomLinkedList<Object> customLinkedList = new CustomLinkedList<>();

        customLinkedList.add(70);
        customLinkedList.add(30);
        customLinkedList.add(56);
        customLinkedList.addAtFirst(33);
        customLinkedList.viewList();
        Assertions.assertTrue(customLinkedList.search(56));
    }

}
