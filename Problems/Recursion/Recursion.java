package Problems.Recursion;
// import java.util.Arrays;

public class Recursion {
  public static void main(String[] args) {

  }

  static int sum = 0;

  // printing values from 5 to 1
  static void print(int n) {
    if (n == 0)
      return;
    System.out.println(n);
    print(n - 1);
  }

  // print values from 1 to 5
  static void print1(int n) {
    if (n == 6)
      return;
    System.out.println(n);
    print1(n + 1);
  }

  // print sum of first n natural numbers { Maths formulae = n(n + 1)/2 }
  static void sumNumbers(int start, int n, int sum) {
    if (start == n) {
      sum += start;
      System.out.println(sum);
      return;
    }
    sum += start;
    sumNumbers(start + 1, n, sum);
  }

  // fibonacci of a number
  static void fibonacci(int a, int b, int n) {
    if (n == 0)
      return;
    int c = a + b;
    System.out.println(c);
    fibonacci(b, c, n - 1);
  }

  // print something 5 times
  static void print5(int n) {
    if (n == 0)
      return;
    System.out.println("Hello World");
    print5(n - 1);
    System.out.println("Yash");
  }

  static int fibo(int n) {
    if (n < 2) {
      return n;
    }
    return fibo(n - 1) + fibo(n - 2);
  }

  // Binary search using RECURSION
  static int binarySearchRecursion(int nums[], int target, int start, int end) {
    if (start > end) {
      return -1;
    }

    int mid = start + (end - start) / 2;
    if (target == nums[mid]) {
      return mid;
    }

    if (target > nums[mid]) {
      // System.out.println("Yash");
      return binarySearchRecursion(nums, target, mid + 1, end);
    }
    return binarySearchRecursion(nums, target, start, mid - 1);
  }

  static void printN(int n) {
    if (n == 0)
      return;
    System.out.println(n);
    printN(n - 1);
    System.out.println(n);
  }

  static int fact(int n) {
    // static int fact(int n, int mul) {
    if (n <= 0)
      return 1;
    // mul *= n;
    // int r = fact(n - 1, mul);
    return n * fact(n - 1);
    // return r;
  }

  static int sumOfDigits(int n) {
    if (n == 0) {
      return 0;
    }
    return (n % 10) + sumOfDigits(n / 10);
  }

  static int productOfDigits(int n) {
    if (n % 10 == n) {
      return n;
    }
    return (n % 10) * productOfDigits(n / 10);
  }

  static void printt(int n) {
    if (n == 5)
      return;
    System.out.println(n);
    printt(n++);
  }

  static void revNum(int n) {
    if (n == 0) {
      return;
    }
    int rem = n % 10;
    sum = sum * 10 + rem;
    // System.out.println(sum);
    revNum(n / 10);
  }

  // bubble sort using recursion
  static void bubble(int nums[], int len) {
    if (len <= 1) {
      return;
    }
    int count = 0;
    for (int i = 0; i < len - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        int temp = nums[i + 1];
        nums[i + 1] = nums[i];
        nums[i] = temp;
        count++;
      }
    }
    if (count == 0) {
      return;
    }
    bubble(nums, len);
  }

}
