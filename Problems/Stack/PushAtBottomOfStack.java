package Problems.Stack;

import java.util.Stack;

public class PushAtBottomOfStack {

  public static void addElements(Stack<Integer> stack, int data) {
    stack.push(data);
    return;
  }

  public static void addAllElements(Stack<Integer> stack1, Stack<Integer> stack2) {
    while (!stack2.isEmpty()) {
      int val = stack2.getLast();
      stack2.pop();
      stack1.add(val);
    }
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.print("Before Adding the elemnt to the bottom" + stack);
    System.out.println();
    // Emptying the stack and fillin the elements in a new stack
    Stack<Integer> stack2 = new Stack<>();
    while (!stack.isEmpty()) {
      stack2.add(stack.getLast());
      stack.pop();
    }

    // Add the element to the stack
    addElements(stack, 50);
    addElements(stack, 30);

    // Adding back all the elements in to the stack in order
    addAllElements(stack, stack2);

    // Printing the stack after pushing the element the bottom
    System.out.println("After pushing the stack to the bottom : " + stack);
  }
}
