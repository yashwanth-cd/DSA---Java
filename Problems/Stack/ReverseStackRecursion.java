package Problems.Stack;

import java.util.Stack;

public class ReverseStackRecursion {

  public static void pushAtBottom(Stack<Integer> stack, int data) {
    if (stack.isEmpty()) {
      stack.push(data);
      return;
    }
    int top = stack.pop();
    pushAtBottom(stack, data);
    stack.push(top);
  }

  public static void reverse(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return;
    }
    int top = stack.pop();
    reverse(stack);
    pushAtBottom(stack, top);
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(20);
    stack.push(90);
    stack.push(30);
    reverse(stack);
    System.out.println(stack);
  }
}
