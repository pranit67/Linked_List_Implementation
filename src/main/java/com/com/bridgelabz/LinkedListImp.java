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

    public void printList() {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImp linkedListImp = new LinkedListImp();
//        linkedListImp.addingNode(70);
//        linkedListImp.addingNode(30);
//        linkedListImp.addingNode(56);
        linkedListImp.appendNode(56);
        linkedListImp.appendNode(30);
        linkedListImp.appendNode(70);
        linkedListImp.printList();
    }
}