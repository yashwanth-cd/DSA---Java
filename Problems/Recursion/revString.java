package Problems.Recursion;

public class revString {
  public static void main(String[] args) {
    String str = "abcdefghijk";
    int len = str.length() - 1;
    revStr(str, len);
  }

  static void revStr(String str, int len) {
    if (len < 0)
      return;
    System.out.print(str.charAt(len) + " ");
    revStr(str, len - 1);
  }

  static String printRev(String str) {
    if (str.equals("")) {
      return "";
    }
    return printRev(str.substring(1)) + str.charAt(0);
  }
}
