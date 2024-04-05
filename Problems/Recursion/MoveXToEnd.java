package Problems.Recursion;

public class MoveXToEnd {
  public static void main(String[] args) {
    int count = 0;
    int index = 0;
    String str = "axbcxxd";
    moveX(str, index, count);
    System.out.println(newStr);
  }

  static String newStr = "";

  static void moveX(String str, int index, int count) {
    if (index == str.length()) {
      for (int i = 0; i < count; i++) {
        newStr += "x";
      }
      return;
    }
    char currentCharacter = str.charAt(index);
    if (currentCharacter == 'x') {
      count++;
      moveX(str, index + 1, count);
    } else {
      newStr += currentCharacter;
      moveX(str, index + 1, count);
    }
  }
}
