package Problems.Linkedlist;

public class MiddleOfLL {
  static int size = 0;
  Node head;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  public void insertFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void printLL() {
    if (head == null) {
      return;
    }
    Node pointer = head;
    while (pointer != null) {
      System.out.print(pointer.data + " -> ");
      pointer = pointer.next;
    }
    System.out.println("null");
  }

  // Return the middle node of the linked list
  public int printMiddle() {
    if (head == null) {
      return -1;
    }
    Node hare = head;
    Node turtle = head;
    while (hare != null && hare.next != null) {
      turtle = turtle.next;
      hare = hare.next.next;
    }
    return turtle.data;
  }

  public static void main(String[] args) {
    MiddleOfLL list = new MiddleOfLL();
    list.insertFirst(12);
    list.insertFirst(15);
    list.insertFirst(16);
    list.insertFirst(19);
    list.insertFirst(20);
    list.printLL();

    int middleOfList = list.printMiddle();
    System.out.println(middleOfList);
  }
}
