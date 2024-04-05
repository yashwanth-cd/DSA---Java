package Problems.Recursion;

public class RemoveDuplicates {
  public static void main(String[] args) {
    String str = "abbccda";
    removeDupes(str, 0);
  }

  static boolean check[] = new boolean[25];
  static String newStr = "";

  static void removeDupes(String str, int index) {
    if (index == str.length()) {
      System.out.println(newStr);
      return;
    }
    char currentCharacter = str.charAt(index);
    int findIndex = currentCharacter - 'a';
    if (check[findIndex] == false) {
      newStr += currentCharacter;
      check[findIndex] = true;
      removeDupes(str, index + 1);
    } else {
      removeDupes(str, index + 1);
    }
  }
}
