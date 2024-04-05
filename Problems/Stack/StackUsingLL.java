package Problems.Stack;

public class StackUsingLL {

  // Creating the local head
  public Node head;

  // Creating Node class to create nodes
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
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
    head = head.next;
  }

  public int peek() {
    if (isEmpty()) {
      return -1;
    }
    return head.data;
  }

  public static void main(String[] args) {
    StackUsingLL stack = new StackUsingLL();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.pop();
    int res = stack.peek();
    System.out.println(res);
    // while (!stack.isEmpty()) {
    // System.out.println(stack.peek());
    // stack.pop();
    // }
  }
}
