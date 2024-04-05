package Problems.Recursion;

public class FirstLastOccurance {
  public static void main(String[] args) {
    String str = "abaajhsvbda"; // (0, 6)
    // int len = str.length() - 1;
    findFirstLast(str, 0, 'a');

  }

  static int first = -1;
  static int last = -1;

  static void findFirstLast(String str, int index, char target) {
    if (index == str.length()) {
      System.out.println(first);
      System.out.println(last);
      return;
    }
    if (str.charAt(index) == target) {
      if (first == -1) {
        first = index;
      } else {
        last = index;
      }
    }
    findFirstLast(str, index + 1, target);
  }
}
