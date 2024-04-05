package Problems.Arrays;

public class checkIfSorted {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 3, 4, 5, 6, 7, 8 };
    int len = nums.length;
    boolean res = checkSort(nums, len);
    System.out.println(res);
  }

  // Time complexity = O(n)
  static boolean checkSort(int nums[], int len) {
    // boolean check = false;
    for (int i = 0; i < len - 1; i++) {
      if (nums[i] <= nums[i + 1]) {
        // check = true;
      } else {
        return false;
      }
    }
    return true;
  }
}
