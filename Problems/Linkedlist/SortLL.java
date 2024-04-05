package Problems.Linkedlist;

import java.util.LinkedList;

public class SortLL {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(12);
    list.add(1);
    list.add(6);
    list.add(87);
    list.add(2);
    LinkedList<Integer> ans = sort(list);
    System.out.println(ans);
  }

  public static LinkedList<Integer> sort(LinkedList<Integer> list) {
    int size = list.size();
    if (size <= 1) {
      return list;
    }
    boolean swapped = false;
    do {
      swapped = false;
      for (int i = 0; i < size - 1; i++) {
        int cur = list.get(i);
        int next = list.get(i + 1);
        if (cur > next) {
          list.set(i, next);
          list.set(i + 1, cur);
          swapped = true;
        }
      }
    } while (swapped);
    return list;
  }
}