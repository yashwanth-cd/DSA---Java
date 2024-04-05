package Problems.Recursion;

public class binarySearch {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 6 };
    int len = nums.length;
    int res = b(nums, 0, len, 6);
    System.out.println(res);
  }

  static int b(int nums[], int start, int end, int target) {
    int mid = start + (end - start) / 2;
    if (start > end) {
      return mid;
    }
    if (target < nums[mid]) {
      return b(nums, start, mid - 1, target);
    } else if (target > nums[mid]) {
      return b(nums, mid + 1, end, target);
    }
    return mid;
  }
}
