package Problems.CircularLinkedlist;

public class CircularLL {
  Node head = null;
  Node tail = null;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public boolean isEmpty() {
    return head == null && tail == null;
  }

  public void insert(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
      tail.next = head;
      return;
    }
    tail.next = newNode;
    newNode.next = head;
    tail = newNode;
  }

  public int getHead() {
    if (isEmpty()) {
      System.out.println("Empty list");
      return -1;
    }
    return head.data;
  }

  public int getTail() {
    if (isEmpty()) {
      System.out.println("Empty list");
      return -1;
    }
    return tail.data;
  }

  public Node prevTailNode() {
    if (isEmpty()) {
      System.out.println("Empty list");
      return head;
    }
    Node pointer = head;
    while (pointer.next != tail) {
      pointer = pointer.next;
    }
    return pointer;
  }

  public int removeTail() {
    if (isEmpty()) {
      System.out.println("Empty list");
      return -1;
    }
    Node nodeBeforeTail = prevTailNode();
    int tailValue = tail.data;
    if (nodeBeforeTail == tail) {
      head = tail = null;
    } else {
      nodeBeforeTail.next = head;
      tail = nodeBeforeTail;
    }
    return tailValue;
  }

  public void print() {
    if (isEmpty()) {
      System.out.println("Empty list");
      return;
    }
    Node pointer = head;
    do {
      System.out.print(pointer.data + " -> ");
      pointer = pointer.next;
    } while (pointer != head);
    System.out.println("head");
  }

  public static void main(String[] args) {
    CircularLL cl = new CircularLL();
    cl.insert(8);
    cl.insert(9);
    cl.insert(7);
    cl.insert(2);
    System.out.println("Removed : " + cl.removeTail());
    System.out.println("Removed : " + cl.removeTail());
    cl.print();
    // System.out.println("Head of CLL : " + cl.getHead());
    // System.out.println("Tail of CLL : " + cl.getTail());
  }
}
