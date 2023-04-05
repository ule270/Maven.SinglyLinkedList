package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node head;
    private Node next;
    private int data;
    static class Node{
        Node next;
        int data;
    }
    public SinglyLinkedList(){
        head = null;
    }
//    add -- add an element to the list
    public void addElement(int num){
        Node add = new Node();
        add.data = num;
//        head = null means LinkedList is empty
        if (head == null){
//        head = add so it becomes the first node
            head = add;
        } else {
            Node current = head;
//            while current node is not null meaning
//                it is not pointing to the end null
            while (current.next != null) {
//            set current to the next one
                current = current.next;
            }
            current.next = add;
        }
    }
//    remove -- remove an element (specified by numeric index) from the list
//    contains -- returns true if the element is in the list, false otherwise
//    find -- returns the element's index if it is in the list, -1 otherwise
//    size -- returns the current size of the list
    public int size(){
        int count = 0;
        Node current = head;
        if (head.next == null){
            return 1;
        }
        while (current.next != null){
            current = current.next;
            count++;
        }
        return count;
    }
//    get -- returns the element at the specified index
//    copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//    sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)

}
