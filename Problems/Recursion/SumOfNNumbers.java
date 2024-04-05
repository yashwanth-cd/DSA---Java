package Problems.Recursion;

public class SumOfNNumbers {
  public static void main(String[] args) {
    int n = 5;
    int res = sumOfN(n);
    System.out.println(res);
  }

  static int sumOfN(int n) {
    if (n <= 0) {
      return n;
    }
    // return sumOfN(n - 1) + n;
    return n + sumOfN(n - 1);

  }
}