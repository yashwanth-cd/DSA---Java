package Problems.Linkedlist;

import java.util.LinkedList;

public class LinkedListUsingFramework {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addLast(100);
    list.addFirst(200);
    System.out.println(list);
    System.out.println(list.size());
    list.removeFirst();
    list.removeLast();
    System.out.println(list);
    System.out.println(list.size());
    list.addFirst(500);
    // list.clear();
    System.out.println(list);
    System.out.println(list.contains(500));

    // printing the values using loop
    list.add(12);
    list.add(20);
    for (int i : list) {
      System.out.print(i + " -> ");
    }
    System.out.println("null");
  }

  // Searching in Linked list
  static boolean checkPresence(LinkedList<Integer> l, int target) {
    // variation 1
    // for(int val : l) {
    // if(val == target) {
    // return true;
    // }
    // }
    // variation 2
    // for (int i = 0; i < l.size(); i++) {
    // if (l.get(i) == target) {
    // return true;
    // }
    // }
    // variation 3
    if (l.contains(target)) {
      return true;
    }
    return false;
  }
}
