package Problems.Arrays;

import java.util.Arrays;

public class largestElement {
  public static void main(String[] args) {
    int nums[] = { 12, 34, 45, 65, 98, 72 };
    int res = largestElementBetter(nums);
    System.out.println(res);
  }

  ///// BRUTEFORCE ///// SORTING AN ELEMENT AND RETURNING THE LAST ELEMENT
  // Time complexity = O(n log n)
  static int largestElementBetter(int nums[]) {
    Arrays.sort(nums); // Sort using mergesort or quicksort
    int n = nums.length;
    return nums[n - 1];
  }

  ///////////// OPTIMIZED METHOD
  // Time complexity = O(n)
  static int largestElementBrute(int nums[]) {
    int largest = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largest) {
        largest = nums[i];
      }
    }
    return largest;
  }
}
