
public class Practice {
  Node head;
  Node tail;

  class Node {
    int val;
    Node next;

    Node(int data) {
      this.val = data;
      next = null;
    }
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void insertNode(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
      return;
    }
    tail.next = newNode;
    newNode.next = head;
    tail = newNode;
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Empty list");
      return;
    }
    Node pointer = head;
    do {
      System.out.print(pointer.val + " <=> ");
      pointer = pointer.next;
    } while (pointer != head);
    System.out.println("head");
  }

  public static void main(String[] args) {
    Practice p = new Practice();
    p.insertNode(10);
    p.insertNode(20);
    p.insertNode(30);
    p.insertNode(40);
    p.insertNode(50);
    p.display();
  }
}