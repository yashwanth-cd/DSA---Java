package Problems.Queues;

public class QueueUsingLL {

  // Node class
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {
    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
      return head == null && tail == null;
    }

    public void add(int data) {
      Node newNode = new Node(data);
      if (tail == null) {
        head = tail = newNode;
        return;
      }
      tail.next = newNode;
      tail = newNode;
    }

    public int remove() {
      if (isEmpty()) {
        System.out.println("Empty Queue, Nothing to remove");
        return -1;
      }
      if (head == tail) {
        tail = null;
      }
      int front = head.data;
      head = head.next;
      return front;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("Empty Queue, Nothing to peek");
        return -1;
      }
      return head.data;
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    System.out.println("removed : " + q.remove()); // 10 is removed
    System.out.println("removed : " + q.remove()); // 20 is removed
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
