package Problems.Recursion;

public class DecimalToBinary {
  public static void main(String[] args) {
    int n = 6;
    String res = findBinary(n, "");
    System.out.println(res);
  }

  // static long res = 0;
  static String findBinary(int n, String s) {
    if (n == 0) {
      return s;
    }
    s = (n % 2) + s;
    return findBinary(n / 2, s);
  }
}
