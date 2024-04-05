package Problems.Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
  static class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    public int size = 0;

    // Checking of the list is empty
    public boolean isEmpty() {
      return list.size() == 0;
    }

    // Pushing an element into the stack arraylist top
    public void push(int data) {
      list.add(data);
      size++;
      return;
    }

    // Popping the top element from the arraylist
    public int pop() {
      if ((isEmpty())) {
        return -1;
      }
      int top = list.get(size - 1);
      list.remove(size - 1);
      size--;
      return top;
    }

    // Peeking the top element of the stack array list
    public int peek() {
      if (isEmpty()) {
        return -1;
      }
      return list.get(size - 1);
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    // s.pop();
    // s.pop();
    System.out.println(s.list);
    System.out.println(s.peek());
  }
}
