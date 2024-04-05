package Problems.Recursion;

import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a binary value : ");
    int n = sc.nextInt();
    int res = btoD(n, 10, 0);
    System.out.println(res);
    sc.close();
  }

  static int res;

  static int btoD(int n, int div, int sq) {
    if (n <= 0) {
      return res;
    }
    int rem = n % 10;
    res += rem * Math.pow(2, sq);
    return btoD(n / 10, div, sq + 1);
  }
}
