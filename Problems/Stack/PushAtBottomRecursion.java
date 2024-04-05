package Problems.Stack;

import java.util.Stack;

public class PushAtBottomRecursion {

  public static void pushAtBottom(Stack<Integer> stack, int data) {
    if (stack.isEmpty()) {
      stack.push(data);
      return;
    }
    int top = stack.pop();
    pushAtBottom(stack, data);
    stack.push(top);
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    pushAtBottom(stack, 40);
    pushAtBottom(stack, 50);
    System.out.println(stack);
  }
}
