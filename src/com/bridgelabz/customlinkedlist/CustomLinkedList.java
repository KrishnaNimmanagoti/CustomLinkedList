package com.bridgelabz.customlinkedlist;

public class CustomLinkedList<T extends Comparable<T>> {
    int size;
    Node head;
    int pos;

    public CustomLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public int getSize() {
        return size;
    }

    public void viewList() {
        Node temp;
        if (head == null) {
            System.out.println("List is Empty");
        }
        else {
            temp = head;
            while (temp != null){
                System.out.print(temp.key + " ");
                temp = temp.next;
            }
        }
    }

    public void add(T value) {
        Node node, temp;
        node = new Node(value);
        temp = head;
        if (temp == null) {
            head = node;
        }
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void addAtFirst(T value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtPosition(T value, int position) {
        if (position == 1) {
            addAtFirst(value);
        } else if (position == size + 1) {
            add(value);
        } else if (position > 1 && position-1 <= size) {
            Node node, temp;
            node = new Node(value);
            temp = head;
            for (int i = 1; i < position-1; i++)
                temp = temp.next;
            node.next = temp.next;
            temp.next = node;
            size++;
        } else {
            System.out.println("Insertion is not possible at: " + position);
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty");
        }
        else {
            head = head.next;
            size--;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is already empty");
        }
        else if (size == 1) {
            head = null;
            size--;
        }
        else {
            Node temp = head;
            for (int i=1; i < size-1; i++)
                temp = temp.next;
            temp.next = null;
            size--;
        }
    }

    public boolean delete(T value) {
        Node temp1 = head;
        int i = 1;
        boolean flag = true;
        boolean returnFlag = false;
        while (temp1.key != value) {
            temp1 = temp1.next;
            i++;
            if (temp1.next == null && temp1.key != value){
                flag = false;
                break;
            }
        }
        if (flag) {
            if (i == 1 && value == temp1.key) {
                deleteFirst();
                System.out.println("The size of LinkeList is:" + size);
                returnFlag = true;
            }
            else {
                Node temp2 = head;
                for (int j = 1; j < i - 1; j++) {
                    temp2 = temp2.next;
                }
                temp2.next = temp1.next;
                size--;
                System.out.println("The size of LinkeList is:" + size);
                returnFlag = true;
            }
        }
        else {
            System.out.println("There is no such: " + value + " in linkedlist");
            returnFlag = true;
        }
        return returnFlag;
    }



    public boolean search(T value) {
        Node node, temp;
        boolean flag = false;
        temp = head;
        if (head == null) {
            System.out.println("List is already empty");
        }
        else {
            for (int i=1; i <= size; i++) {
                if (temp.key == value) {
                    System.out.println("Match found");
                    flag = true;
                    pos = i;
                    System.out.println("Element is at position: " + i);
                    break;
                }
                temp = temp.next;
            }
            if (!flag) {
                System.out.println("Element is not Present");
            }
        }
    return flag;
    }

    public boolean placeElementAfterProvidedElement(T keyValue, T placeValue) {
        boolean result = search(keyValue);
        addAtPosition(placeValue, pos + 1);
        System.out.println("The provide value " + placeValue + " is placed after " + keyValue +
                            " in the position: " + (pos+1));
        return result;
    }

    public void insertInOrder(T value){
        Node<T> temp = head;
        for(int i=0; i<size; i++){
            if(temp.key.compareTo(value) > 0){
                addAtPosition(value, i);
                return;
            }
        }
        add(value);
    }
}
