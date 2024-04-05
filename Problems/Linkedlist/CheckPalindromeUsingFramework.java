package Problems.Linkedlist;

import java.util.LinkedList;

public class CheckPalindromeUsingFramework {
  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>();
    list1.add(1);
    list1.add(2);
    list1.add(2);
    list1.add(1);
    list1.add(2);
    list1.add(2);
    list1.add(1);
    boolean ans = isPalindrome2(list1);
    System.out.println(ans);
  }

  static boolean isPalindrome(LinkedList<Integer> list1, LinkedList<Integer> list2) {
    // Copies from list1 to list2 in reverse order
    for (Integer val : list1) {
      list2.addFirst(val);
    }

    // comparing the both lists
    int i = 0;
    while (i < list1.size() / 2) {
      if (list1.get(i) == list2.get(i)) {
        i++;
      } else {
        return false;
      }
    }
    return true;
  }

  static boolean isPalindrome2(LinkedList<Integer> list1) {
    int size = list1.size();
    if (size <= 1) {
      return true;
    }

    for (int i = 0; i < size / 2; i++) {
      int first = list1.get(i);
      int last = list1.get(size - 1 - i);
      if (first != last) {
        return false;
      }
    }
    return true;
  }
}
