package Problems.Linkedlist;

public class InsertNodeAtIndex {
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

  public void insertAtIndex(int index, String data) {
    // base case for empty list
    if (head == null) {
      return;
    }
    Node newNode = new Node(data);
    // base case if index is head
    if (index == 1) {
      newNode.next = head;
      head = newNode;
      return;
    }
    Node pointer = head;
    int i = 1;
    while (i < index - 1 && pointer.next != null) {
      pointer = pointer.next;
      i++;
    }
    if (i < index - 1) {
      return;
    }
    newNode.next = pointer.next;
    pointer.next = newNode;
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
    InsertNodeAtIndex list = new InsertNodeAtIndex();
    list.insertFirst("code");
    list.insertFirst("to");
    list.insertFirst("loves");
    list.insertFirst("Yash");
    list.printList();

    System.out.println("Inserting a new node at index 2");
    list.insertAtIndex(2, "always");
    list.printList();
    System.out.println(list.getSize());

  }
}
