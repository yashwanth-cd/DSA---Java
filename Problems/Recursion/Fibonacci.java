package Problems.Recursion;

public class Fibonacci {
  public static void main(String[] args) {
    int n = 50;
    for (int i = 0; i < n; i++) {
      System.out.println(fibo(i) + " ");
    }
  }

  static int fibo(int n) {
    if (n <= 1) {
      return n;
    }
    return fibo(n - 1) + fibo(n - 2);
  }
}
