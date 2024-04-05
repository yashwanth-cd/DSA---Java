package Problems.Queues;

import java.util.Queue;
import java.util.LinkedList;
// import java.util.ArrayDeque;

public class QueueUsingFramework {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<Integer>();
    // Queue<Integer> q = new ArrayDeque<Integer>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(0);
    q.add(50);
    System.out.print("Before : " + q);
    System.out.println();
    System.out.println("Removed element is : " + q.remove());
    System.out.println("Removed element is : " + q.remove());
    System.out.println("Removed element is : " + q.remove());
    System.out.println("After : " + q);
    System.out.println("Peek ( front ) element of the Queue is  : " + q.peek());
  }
}
