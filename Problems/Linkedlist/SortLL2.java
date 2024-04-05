package Problems.Linkedlist;

public class SortLL2 {
  Node head;
  static int size = 0;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
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

  // sort the linked list
  public SortLL2 sort(SortLL2 list) {
    if (head == null || head.next == null) {
      return list;
    }
    boolean swapped;
    do {
      swapped = false;
      Node current = head;
      Node nextOne = head.next;
      while (current.next != null) {
        if (current.data > nextOne.data) {
          int temp = current.data;
          current.data = nextOne.data;
          nextOne.data = temp;
          swapped = true;
        }
        current = current.next;
        nextOne = nextOne.next;
      }
    } while (swapped);
    return list;
  }

  public void printLL() {
    if (head == null) {
      System.out.println("Linked list is empty");
      return;
    }

    Node pointer = head;
    while (pointer != null) {
      System.out.print(pointer.data + " -> ");
      pointer = pointer.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    SortLL2 list = new SortLL2();
    list.insertFirst(12);
    list.insertFirst(34);
    list.insertFirst(54);
    list.insertFirst(12);
    list.insertFirst(98);
    System.out.println("Before Sorting the linked list : ");
    list.printLL();
    System.out.println("After Sorting the linked list : ");
    SortLL2 sortedLL = list.sort(list);
    sortedLL.printLL();
  }
}
