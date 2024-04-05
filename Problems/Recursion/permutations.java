package Problems.Recursion;

public class permutations {
  public static void main(String[] args) {
    String str = "abc";
    findPerm(str, "");
  }

  static void findPerm(String str, String perm) {
    // Base case
    if (str.length() == 0) {
      System.out.println(perm);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i + 1);
      findPerm(newStr, perm + currentChar);
    }
  }
}
