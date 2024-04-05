package Problems.Recursion;

import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string : ");
    String str = sc.nextLine();
    int len = str.length();
    boolean ans = checkPalindrome(str, len);
    System.out.println(ans);
    sc.close();
  }

  static boolean checkPalindrome(String str, int len) {
    if (len == 0 || len == 1) {
      return true;
    }

    if (str.charAt(0) == str.charAt(len - 1)) {
      return checkPalindrome(str.substring(1, len - 1), len - 2);
    }
    return false;
  }
}
