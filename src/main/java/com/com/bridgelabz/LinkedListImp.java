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

    /* Adding Node by using add method  */
//    public void addingNode(Integer data) {
//
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
    /*Adding data by Append method */
    public void appendNode(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        newNode.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
        return;
    }

    /*  Inserting node between  */
    public void insertNode(Node prevNode, Integer data) {

        if (prevNode == null) {
            System.out.print("The previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void printList() {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImp linkedListImp = new LinkedListImp();
        linkedListImp.appendNode(56);
        linkedListImp.appendNode(70);
        linkedListImp.insertNode(linkedListImp.head, 30);
        linkedListImp.printList();
    }
}