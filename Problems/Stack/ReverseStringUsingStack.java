package Problems.Stack;

import java.util.Stack;

public class ReverseStringUsingStack {

  public static void main(String[] args) {
    Stack<Character> stack = new Stack<Character>();
    seperateString(stack, "Yashwanth");
  }

  public static void seperateString(Stack<Character> stack, String str) {
    for (int i = 0; i < str.length(); i++) {
      char a = str.charAt(i);
      stack.push(a);
    }
    System.out.println(stack);
  }
}
