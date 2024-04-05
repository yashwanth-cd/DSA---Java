package Problems.Linkedlist;

public class DeleteAtIndex {
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

  public void deleteIndex(int index) {
    if (head == null || index <= 0) {
      return;
    }
    Node pointer = head;
    if (index == 1) {
      head = head.next;
      return;
    }
    int i = 1;
    while (i < index - 1) {
      pointer = pointer.next;
    }
    pointer.next = pointer.next.next;
  }

  public static void main(String[] args) {
    DeleteAtIndex list = new DeleteAtIndex();
    list.insertFirst(12);
    list.insertFirst(15);
    list.insertFirst(16);
    list.insertFirst(19);
    list.insertFirst(20);
    list.printLL();

    // Deleting the node at index 2 i.e., 15
    list.deleteIndex(2);
    list.printLL();
  }
}
