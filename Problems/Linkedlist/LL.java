package Problems.Linkedlist;

public class LL {
  // To track the size of the linked list
  public int size = 0;

  // Creating a static head variable for poiting to the first node of the linked
  // list
  Node head;

  // Contructor to track the size of the linked list
  // LL() {
  // this.size = 0;
  // }

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

  // Adding the new node at the end of the linked list
  public void insertLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    // Traverse through the end of the linked list
    Node currentPointer = head;
    while (currentPointer.next != null) {
      currentPointer = currentPointer.next;
    }
    currentPointer.next = newNode;
  }

  // Delete the first node of the linked list
  public void deleteFirstNode() {
    if (head == null) {
      System.out.println("Linked List is empty!!");
      return;
    }
    size--;
    head = head.next;
  }

  // Deleting the last node of the linked list
  public void deleteLastNode() {
    if (head == null) {
      System.out.println("Linked List is empty!!");
      return;
    }
    size--;
    if (head.next == null) {
      // System.out.println("Linked list has only one element");
      head = null;
      return;
    }
    Node secondLast = head;
    Node last = head.next;
    while (last.next != null) {
      secondLast = secondLast.next;
      last = last.next;
    }
    secondLast.next = null;
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

  // Print the size of the linked list
  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    // Creating an object of class LL
    LL list = new LL();
    list.insertFirst("Yash");
    // list.printList();
    list.insertLast("loves");
    list.insertLast("to");
    list.insertLast("code");
    // list.printList();
    System.out.println("--------------- After deleting first node");
    list.deleteFirstNode();
    list.printList();
    System.out.println("--------------- After deleting last element");
    list.deleteLastNode();
    list.printList();
    System.out.println("---------------- Size of the linked list");

    // To display the size of the linked list
    // if size is a static variable
    // System.out.println(LL.size);
    // if size is a public variable
    System.out.println(list.getSize());
  }
}
