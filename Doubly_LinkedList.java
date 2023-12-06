/**************************************************************************************
 * File	            :	Doubly_LinkedList.java
 * Description      :   Write a Java program for the following: 
 						1) Create a doubly linked list of elements. 
						2) Delete a given element from the above list. 
						3) Display the contents of the list after deletion.
 * Language         :   Java
 * Author           :   Tom Sibu
 * Version          :   1.0
 * Date             :   6/12/2023
***************************************************************************************/

package Lab8;

import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head, tail;

    public DoublyLinkedList() {
        this.head = this.tail = null;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        System.out.println("Deleted element from the front: " + temp.data);
    }

    public void deleteEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = tail;
        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }

        System.out.println("Deleted element from the end: " + temp.data);
    }

    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        System.out.println("Deleted element from position " + position + ": " + current.data);
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.println("Doubly Linked List:");
        Node current = head;
        System.out.print("List : ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class Doubly_LinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert element at the end");
            System.out.println("2. Delete from front");
            System.out.println("3. Delete from end");
            System.out.println("4. Delete from a position");
            System.out.println("5. Display List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    list.insertEnd(element);
                    break;
                case 2:
                    list.deleteFront();
                    break;
                case 3:
                    list.deleteEnd();
                    break;
                case 4:
                    System.out.print("Enter the position to delete: ");
                    int position = scanner.nextInt();
                    list.deleteFromPosition(position);
                    break;
                case 5:
                    list.displayList();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
