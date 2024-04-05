package Problems.Recursion;

public class StringSubSequence {
  public static void main(String[] args) {
    String str = "abc";
    int index = 0;
    strSub(str, index, "");
  }

  static void strSub(String str, int index, String newStr) {
    if (index == str.length()) {
      System.out.println(newStr);
      return;
    }
    char currentCharacter = str.charAt(index);

    // To be
    strSub(str, index + 1, newStr + currentCharacter);

    // To not be
    strSub(str, index + 1, newStr);
  }

}
