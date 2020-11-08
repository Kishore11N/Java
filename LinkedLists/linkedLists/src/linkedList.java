/*
This file has the data structure of a linked list and some of its basic functions.
Will not be using any of Java's default functions or constructor.
*/

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class linkedList {
    Node head;

    /*
    This function takes in data and creates a new node at the front of the linked list,
    replacing the previous head.

    @param = data  The data of the new node
    @return = A new node with data replacing the head.

    */

    public void append(int data) { 

        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;

        while (current.next != null) {

            current = current.next;

        }

        if (current.next == null) {

            current.next = new Node(data);

        }

    }

    /*
    This function takes in data and creates a new node at the end of the linked list.
    @param data
    @return A new node with data at the end of a linked list
    
    */
       public void prepend(int data) {

        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    /*
    This function takes in data and finds a node with corresponding data,
    and then procceds to delete the node from the linked list.
    @param data
    @return A new linked list without the node containing data.

    */
    
    public void deleteWithValue(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
        }
        
        Node current = head;
        while ((current.next.data) != data) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }

        }

    }

}
