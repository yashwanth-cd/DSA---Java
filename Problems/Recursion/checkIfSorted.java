package Problems.Recursion;

public class checkIfSorted {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 5, 6, 12, 78, 98 };
    int len = nums.length - 1;
    boolean ans = isSorted(nums, len, 0);
    System.out.println(ans);
  }

  static boolean isSorted(int nums[], int n, int start) {
    if (start == n) {
      return true;
    }
    if (nums[start] > nums[start + 1]) {
      return false;
    }
    return isSorted(nums, n, start + 1);
  }
}
