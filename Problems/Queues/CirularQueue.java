package Problems.Queues;

public class CirularQueue {

  static class Queue {
    int queue[];
    int front = -1;
    int rear = -1;
    int size;

    public Queue(int size) {
      queue = new int[size];
      this.size = size;
    }

    public boolean isEmpty() {
      return front == -1 && rear == -1;
    }

    public boolean isFull() {
      return (rear + 1) % size == front;
    }

    public void add(int data) {
      if (isFull()) {
        System.out.println("Queue is full");
        return;
      }
      if (front == -1) {
        front = 0;
      }
      rear = (rear + 1) % size;
      queue[rear] = data;
    }

    public int remove() {
      if (isEmpty()) {
        System.out.println("Empty Queue, Nothing to remove");
        return -1;
      }
      if (front == rear) {
        front = rear = -1;
        return -1;
      }
      int frontEl = queue[front];
      front = (front + 1) % size;
      return frontEl;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("Empty Queue, Nothing to peek");
        return -1;
      }
      return queue[front];
    }

    public void printQueue() {
      while ((front + 1 % size) == rear) {
        System.out.println(queue[front]);
        front = (front + 1) % size;
      }
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue(6);
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    q.add(60);
    System.out.println(q.remove()); // removes the front i.e., 10
    q.add(80); // Adds 80 at the 10 place as rear
    System.out.println(q.remove());
    // q.add(100);
    System.out.println("front value is : " + q.peek());
    int count = 0;
    while (!q.isEmpty()) {
      count++;
      System.out.println(q.peek());
      q.remove();
    }
    System.out.println("the number of elements the queue are : " + count);
  }
}
