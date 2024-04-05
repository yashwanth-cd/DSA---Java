package Problems.Linkedlist;

public class Merge2ListsSorted {
  // To track the size of the linked list
  public int size = 0;

  // Creating a head variable for poiting to the first node of the linked
  // list
  Node head;

  // class for each node with data and next reference
  public class Node {
    // variable for node data
    int data;
    // variable for next reference
    Node next;

    // Method for storing data into the Node class variables from callbacks
    Node(int data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // Adding the new node at beginning of the linked list
  public void insertFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // Adding the new node at the last of the linked list
  public void insertLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node pointer = head;
    while (pointer.next != null) {
      pointer = pointer.next;
    }
    pointer.next = newNode;
  }

  // Merging 2 sorted linked lists into a single sorted list
  static Merge2ListsSorted mergeLists(Merge2ListsSorted list1, Merge2ListsSorted list2) {
    Node first = list1.head;
    Node second = list2.head;

    // Creating a new LL for storing the merges list
    Merge2ListsSorted newList = new Merge2ListsSorted();

    // loop and compare between the nodes of both list
    while (first != null && second != null) {
      if (first.data < second.data) {
        newList.insertLast(first.data);
        first = first.next;
      } else {
        newList.insertLast(second.data);
        second = second.next;
      }
    }
    while (first != null) {
      newList.insertLast(first.data);
      first = first.next;
    }
    while (second != null) {
      newList.insertLast(second.data);
      second = second.next;
    }
    return newList;
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
    Merge2ListsSorted list1 = new Merge2ListsSorted();
    list1.insertLast(1);
    list1.insertLast(2);
    list1.insertLast(5);

    Merge2ListsSorted list2 = new Merge2ListsSorted();
    list2.insertLast(1);
    list2.insertLast(2);
    list2.insertLast(9);
    list2.insertLast(15);

    Merge2ListsSorted res = mergeLists(list1, list2);
    res.printList();

  }
}
