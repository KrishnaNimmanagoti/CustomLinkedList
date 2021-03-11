package com.bridgelabz.customlinkedlist;

public class CustomLinkedList<T> {
    int size;
    Node head;

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
        } else if (position > 1 && position <= size) {
            Node node, temp;
            node = new Node(value);
            temp = head;
            for (int i = 1; i < position; i++)
                temp = temp.next;
            node.next = temp.next;
            temp.next = node;
            size++;
        } else {
            System.out.println("Insertion is not possible at: " + position);

        }
    }
}
