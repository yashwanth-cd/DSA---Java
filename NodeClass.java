import java.util.LinkedList;

public class NodeClass {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(20);
    list.add(10);
    System.out.println(list);
    boolean ans = isPalindrome(list);
    if (ans) {
      System.out.println("The given linked list is palindrome!!");
    } else {
      System.out.println("The given linked list is not a palindrome!!");
    }

  }

  static boolean isPalindrome(LinkedList<Integer> list) {
    int size = list.size();
    if (size <= 1) {
      return true;
    }
    for (int i = 0; i < size / 2; i++) {
      if (list.get(i) != list.get(size - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}