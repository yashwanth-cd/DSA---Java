package Problems.Stack;

public class FindMiddleOfStackLL {

  // Creating the local head
  public Node head;
  static int size = 0;

  // Creating Node class to create nodes
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // Checking if the stack is empty
  public boolean isEmpty() {
    return head == null;
  }

  // Implementing the push operation on stack
  public void push(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // Implementing the pop operation on stack
  public void pop() {
    if (isEmpty()) {
      return;
    }
    size--;
    head = head.next;
  }

  public int middle() {
    if (isEmpty()) {
      System.out.println("Empty Stack");
      return -1;
    }
    Node tortoise = head;
    Node hare = head;
    while (hare != null && hare.next != null) {
      tortoise = tortoise.next;
      hare = hare.next.next;
    }
    return tortoise.data;
  }

  public int peek() {
    if (isEmpty()) {
      return -1;
    }
    return head.data;
  }

  public static void main(String[] args) {
    FindMiddleOfStackLL stack = new FindMiddleOfStackLL();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.push(60);
    // int res = stack.peek();
    // System.out.println(res);

    // Finding the middle element of the Linked list
    System.out.println("Middle of the Stack is : " + stack.middle());

    // Printing the entire stack
    while (!stack.isEmpty()) {
      System.out.println(stack.peek());
      stack.pop();
    }
  }
}
