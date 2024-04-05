package Problems.Linkedlist;

import java.util.LinkedList;

public class ReverseLLUsingFramework {
  static LinkedList<Integer> finalList = new LinkedList<Integer>();

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    System.out.println(list);
    revLL(list);
    System.out.println(finalList);
  }

  static void revLL(LinkedList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      int val = list.get(i);
      finalList.addFirst(val);
    }
  }
}