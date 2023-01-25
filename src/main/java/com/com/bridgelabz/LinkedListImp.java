package com.com.bridgelabz;

public class LinkedListImp {
    private Node head;

    private static class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImp linkedListImp = new LinkedListImp();
        linkedListImp.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        linkedListImp.head.next = second;
        second.next = third;

        linkedListImp.printList();
    }
}