package Problems.Arrays;

import java.util.Arrays;

public class secondLargestElement {
  public static void main(String[] args) {
    int nums[] = { 3, 5, 1, 8, 9, 7 };
    int len = nums.length;
    int res = secondLargestOptimal(nums, len);
    System.out.println(res);
  }

  ///////////// BRUTEFORCE
  //////////////////// SORTING THE ARRAY AND SEARCHING FOR FIRST ELEMENT SMALLER
  //////////////////// THAN THE LARGEST
  // Time complexity = O(n log n + n)
  static int secondLargestBrute(int nums[], int len) {
    Arrays.sort(nums); // sort using mergesort or quicksort
    int second = nums[len - 2];
    for (int i = len - 2; i >= 0; i--) {
      if (nums[i] <= second) {
        return nums[i];
      }
    }
    return second;
  }

  //////////// BETTER SOLUTION FOR
  // Time complexity = O(n + n) => O(2n)
  static int secondLargestBetter(int nums[], int len) {
    int largest = nums[0];

    // Loop 1 for getting the largest element in nums array
    for (int i = 0; i < len; i++) {
      if (nums[i] > largest) {
        largest = nums[i];
      }
    }
    int secondLargest = -1;
    // Loop 2 for getting the element smaller than largest and greater than -1
    for (int i = 0; i < len; i++) {
      if (nums[i] < largest && nums[i] > secondLargest) {
        secondLargest = nums[i];
      }
    }
    return secondLargest;
  }

  ////////////// OPTIMAL SOLUTION FOR
  // Time complexity = O(n)
  static int secondLargestOptimal(int nums[], int len) {
    int largest = nums[0];
    int secondLargest = -1;
    for (int i = 1; i < len; i++) {
      if (nums[i] > largest) {
        secondLargest = largest;
        largest = nums[i];
      }
    }
    return secondLargest;
  }
}
