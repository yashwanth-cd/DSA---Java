package Problems.Linkedlist;

public class CheckPalindrome {
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

  static ListNode head;
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
  }

  // Check for palindrome
  static boolean isPalindrome() {

    // Finding the first and last element
    ListNode firstPointer = head;
    ListNode lastPointer = head;
    while (lastPointer != null) {
      lastPointer = lastPointer.next;
    }

    // Compare the pointers
    int i = 0;
    while (i < size / 2) {
      int first = firstPointer.data;
      int last = lastPointer.data;
      if (first == last) {
        i++;
        firstPointer = firstPointer.next;
        lastPointer = lastPointer.next;
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    FindDeleteFromEnd c = new FindDeleteFromEnd();
    c.insertFirst(11);
    c.insertFirst(12);
    c.insertFirst(12);
    c.insertFirst(11);
    c.printLL();
    boolean ans = isPalindrome();
    System.out.println(ans);
  }
}
