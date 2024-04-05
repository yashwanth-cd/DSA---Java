package Problems.DoublyLinkedlist;

public class DoublyLinkedList {
  static Node head;
  static Node tail;

  static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void insertFirst(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = newNode;
      return;
    }
    newNode.next = head;
    newNode.prev = null;
    if (head != null) {
      head.prev = newNode;
    }
    head = newNode;
  }

  public void insertLast(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = newNode;
      return;
    }
    Node pointer = head;
    while (pointer.next != null) {
      pointer = pointer.next;
    }
    pointer.next = newNode;
    newNode.prev = pointer;
    tail = newNode;
  }

  public Node find(int after) {
    Node pointer = head;
    while (pointer != null) {
      if (pointer.data == after) {
        return pointer;
      }
      pointer = pointer.next;
    }
    return null;
  }

  public void insertAfterNode(int after, int value) {
    Node afterPointer = find(after);
    if (afterPointer == null) {
      System.out.println("Node not found");
      return;
    }
    Node newNode = new Node(value);
    newNode.next = afterPointer.next;
    afterPointer.next = newNode;
    newNode.prev = afterPointer;
    if (newNode.next != null) {
      newNode.next.prev = newNode;
    }

  }

  public void printDl() {
    if (isEmpty()) {
      System.out.println("Empty Doubly linked list!!");
      return;
    }
    Node pointer = head;
    Node tail = null;
    System.out.println("Doubly Linked List : ");
    System.out.print("null <=> ");
    while (pointer != null) {
      System.out.print(pointer.data + " <=> ");
      tail = pointer;
      pointer = pointer.next;
    }
    if (tail != null) {
      System.out.println("null");
      System.out.println("Reversed Doubly Linked List : ");
      System.out.print("null <=> ");
      while (tail != null) {
        System.out.print(tail.data + " <=> ");
        tail = tail.prev;
      }
      System.out.println("null");
    }
  }

  public static void main(String[] args) {
    DoublyLinkedList dl = new DoublyLinkedList();
    dl.insertLast(8);
    dl.insertLast(2);
    dl.insertLast(5);
    dl.insertLast(6);
    dl.insertAfterNode(5, 100);
    dl.printDl();

    // System.out.println(head.next);
  }
}
