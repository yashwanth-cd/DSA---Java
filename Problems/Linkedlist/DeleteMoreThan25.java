package Problems.Linkedlist;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class DeleteMoreThan25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<Integer>();
    System.out.println("Enter the number of values : ");
    int n = sc.nextInt();
    System.out.println("Enter the values : ");
    for (int i = 0; i < n; i++) {
      int addValue = sc.nextInt();
      list.add(addValue);
    }

    removeMoreThan25(list);
    System.out.println(list);
    sc.close();
  }

  static void removeMoreThan25(LinkedList<Integer> list) {
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      int val = iterator.next();
      if (val >= 25) {
        iterator.remove();
      }
    }
  }
}
