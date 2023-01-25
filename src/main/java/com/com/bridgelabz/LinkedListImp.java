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

    public void addingNode(Integer data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImp linkedListImp = new LinkedListImp();
        linkedListImp.addingNode(70);
        linkedListImp.addingNode(30);
        linkedListImp.addingNode(56);

        linkedListImp.printList();
    }
}