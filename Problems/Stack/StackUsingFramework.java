package Problems.Stack;

import java.util.Stack;

public class StackUsingFramework {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(12);
    s.push(13);
    s.push(14);
    s.push(15);
    System.out.print("Before Stack : " + s);
    System.out.println();
    int popped = s.pop();
    int top = s.peek();
    System.out.println("Popped element is : " + popped);
    System.out.println("Top of the Stack : " + top);
    System.out.println("Is Stack empty ? " + s.isEmpty());
    System.out.println("After Stack : " + s);
  }
}
