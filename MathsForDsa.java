public class MathsForDsa {
  public static void main(String[] args) {
    // int n = 40;
    // boolean list[] = new boolean[n + 1];
    // primeNums(n, list);
    System.out.println(squareRoot2(40, 3));
  }

  // Finding the prime numbers till the nth term
  // Time complexity = O(n * log(log n))
  static void primeNums(int n, boolean primes[]) {
    if (n <= 1) {
      return;
    }
    for (int i = 2; i * i < n; i++) {
      if (!primes[i]) {
        for (int j = i * 2; j <= n; j += i) {
          primes[j] = true;
        }
      }
    }

    for (int i = 0; i < primes.length; i++) {
      if (!primes[i]) {
        System.out.println(i + " " + primes[i]);
      }
    }
  }

  // finding the square root of a number
  // Time complexity = O(sqrt(n))
  static int squareRoot(int n) {
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (i * i == n) {
        return i;
      }
    }
    return -1;
  }

  // Finding the square root of a number using binary search
  // Time complexity = O(log n)
  static double squareRoot2(int n, int p) {
    int start = 0;
    int end = n;
    double root = 0.0;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid * mid == n) {
        return mid;
      }
      if (n < mid * mid) {
        end = mid - 1;
      } else if (n > mid * mid) {
        start = mid + 1;
      }
    }
    double incr = 0.1;
    for (int i = 0; i <= p; i++) {
      while (root * root <= n) {
        root += incr;
      }
      root -= incr;
      incr /= 10;
    }
    return root;
  }
}
