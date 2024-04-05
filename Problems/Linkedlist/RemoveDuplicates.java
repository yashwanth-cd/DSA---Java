package Problems.Linkedlist;

public class RemoveDuplicates {
  // To track the size of the linked list
  public int size = 0;

  // Creating a head variable for poiting to the first node of the linked
  // list
  Node head;

  // class for each node with data and next reference
  public class Node {
    // variable for node data
    String data;
    // variable for next reference
    Node next;

    // Method for storing data into the Node class variables from callbacks
    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // Adding the new node at beginning of the linked list
  public void insertFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // Remove duplicates from the linked list
  public void removeDuplicates() {
    if (head == null) {
      return;
    }
    Node pointer = head;
    while (pointer.next != null) {
      if (pointer.data == pointer.next.data) {
        pointer.next = pointer.next.next;
        System.out.println("Removed a duplicate!");
      } else {
        pointer = pointer.next;
      }
    }
  }

  // Printing the linked list
  public void printList() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node newNode = head;
    while (newNode != null) {
      System.out.print(newNode.data + " -> ");
      newNode = newNode.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    // Creating an object of class LL
    RemoveDuplicates list = new RemoveDuplicates();
    list.insertFirst("code");
    list.insertFirst("code");
    list.insertFirst("to");
    list.insertFirst("loves");
    list.insertFirst("loves");
    list.insertFirst("loves");
    list.insertFirst("Yash");
    list.insertFirst("Yash");

    list.printList();

    // removing the duplicates from linked list
    list.removeDuplicates();
    list.printList();
  }
}
