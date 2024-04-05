package Problems.Linkedlist;

import java.util.Scanner;

public class FindDeleteFromEnd {
  // creating the class that represents a node
  static class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  public ListNode head;
  static int size = 0;

  // Insert a new at start of LL
  public void insertFirst(int data) {
    ListNode newNode = new ListNode(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // Printing the LL
  public void printLL() {
    if (head == null) {
      return;
    }
    ListNode pointer = head;
    while (pointer != null) {
      System.out.print(pointer.data + " -> ");
      pointer = pointer.next;
    }
    System.out.println("null");
  }

  // Delete nth node
  public void deleteN(int n) {
    if (head.next == null || n <= 0) {
      return;
    }
    if (size == n) {
      head = head.next;
      return;
    }
    int prevIndex = size - n;
    ListNode prev = head;
    int i = 1;
    while (i < prevIndex) {
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
  }

  // Printing the Nth node from the end of the linked list
  public ListNode printN(int n) {
    if (head.next == null || n <= 0) {
      return null;
    }
    ListNode pointer = head;
    int indexN = size - n + 1;
    int i = 1;
    while (i < indexN) {
      pointer = pointer.next;
      i++;
    }
    return pointer;
  }

  public static void main(String[] args) {
    FindDeleteFromEnd c = new FindDeleteFromEnd();
    c.insertFirst(40);
    c.insertFirst(30);
    c.insertFirst(20);
    c.insertFirst(10);
    c.printLL();
    System.out.println("Size of the linked list is : " + FindDeleteFromEnd.size);

    // Deleting the 2nd node from last of LL
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a index to delete from end of the linked list : ");
    int i = sc.nextInt();
    // c.deleteN(i);
    // c.printLL();
    System.out.println(c.printN(i).data);
    sc.close();
  }
}
