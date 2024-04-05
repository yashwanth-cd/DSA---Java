package Problems.Queues;

public class QueueUsingArray {

  // Class for the queue data structure
  static class Queue {
    int nums[];
    int rear = -1;
    int size;

    // Constructor of Queue
    public Queue(int size) {
      nums = new int[size];
      this.size = nums.length;
    }

    // Method to check if array is empty
    public boolean isEmpty() {
      // return this.size == 0;
      return rear == -1;
    }

    // Method to add an element to the Queue ( Enque ) - O(1)
    public void add(int data) {
      if (rear == size - 1) {
        System.out.println("Queue is full");
        return;
      }
      rear++;
      nums[rear] = data;
    }

    // Method to remove an element from the Queue ( deque ) - O(n)
    public int deque() {
      if (isEmpty()) {
        System.out.println("Empty Queue, Nothing to remove");
        return -1;
      }
      int front = nums[0];
      for (int i = 0; i < nums.length - 1; i++) {
        nums[i] = nums[i + 1];
      }
      rear--;
      return front;
    }

    // Method to get the front element of the Queue
    public int peek() {
      if (isEmpty()) {
        System.out.println("Empty Queue, Nothing to remove");
        return -1;
      }
      return nums[0];
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue(5);
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    // q.add(50);
    // System.out.println(q.deque()); // 10 removes
    // System.out.println(q.deque()); // 20 removed
    // System.out.println(q.deque()); // 30 removed
    q.deque();
    // q.deque();
    // q.deque();
    // System.out.println(q.peek()); // 40 will be displayed

    // Printing the queue
    while (!q.isEmpty()) {
      System.out.println(q.deque());
    }
  }
}
