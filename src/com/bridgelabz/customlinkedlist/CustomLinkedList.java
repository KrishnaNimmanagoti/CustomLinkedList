package com.bridgelabz.customlinkedlist;

public class CustomLinkedList<T> {
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
}
