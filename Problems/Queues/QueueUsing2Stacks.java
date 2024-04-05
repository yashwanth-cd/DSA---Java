package Problems.Queues;

import java.util.Stack;

public class QueueUsing2Stacks {

  static class Queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    // Checking if stack is empty
    public static boolean isEmpty() {
      return s1.isEmpty();
    }

    // Add eleemnt to the Queue
    public void add(int data) {
      // if (isEmpty()) {
      // s1.push(data);
      // }
      // Transfer all the elements from s1 to s2
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
      s1.push(data);
      while (!s2.isEmpty()) {
        s1.push(s2.pop());
      }
    }

    // Remove element from the Queue
    public int remove() {
      if (s1.isEmpty()) {
        System.out.println("Empty Queue!");
        return -1;
      }
      // int el = s1.pop();
      // return el;
      return s1.pop();
    }

    // Peek the front eleemnt
    public int peek() {
      if (s1.isEmpty()) {
        System.out.println("Empty Queue!");
        return -1;
      }
      return s1.peek();
    }

    public void printQueue() {
      while (!s1.isEmpty()) {
        System.out.println(s1.pop());
      }
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    System.out.println("Front of queue : " + q.peek());
    System.out.println("Removed : " + q.remove());
    System.out.println("Removed : " + q.remove());

    System.out.println("After : ");
    q.printQueue();

  }
}
