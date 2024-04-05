package Problems.Stack;

import java.util.Stack;

public class ReverseStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    reverse(stack);
  }

  public static void reverse(Stack<Integer> stack) {
    Stack<Integer> revStack = new Stack<>();
    while (!stack.isEmpty()) {
      int top = stack.pop();
      // stack.pop();
      revStack.push(top);
    }

    System.out.println(revStack);
  }
}
