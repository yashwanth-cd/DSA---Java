package Problems.Arrays;

public class Search1D {
  public static void main(String[] args) {
    int nums[] = { 23, 23, 34, 34, 34, 43, 43, 45, 56, 67 };
    int target = 34;
    System.out.println(modifiedBinary(nums, target));
  }

  static int linearSearch(int nums[], int target) {
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i]) {
        return i;
      }
    }
    return -1;
  }

  // Time complexity = O(log n)
  static int binarySearch(int nums[], int target) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int middle = start + (end - start) / 2;
      if (target < nums[middle]) {
        end = middle - 1;
      } else if (target > nums[middle]) {
        start = middle + 1;
      } else {
        return middle;
      }
    }
    return -1;
  }

  // Given a sorted array of integers that may contain duplicates, write a
  // function to implement a modified binary search that finds the first
  // occurrence of a target element. If the target element is not found in the
  // array, your function should return -1.
  static int modifiedBinary(int nums[], int target) {
    int start = 0;
    int end = nums.length - 1;
    int res = -1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (target > nums[mid]) {
        start = mid + 1;
      } else if (target < nums[mid]) {
        end = mid - 1;
      } else {
        res = mid;
        end = mid - 1;
      }
    }
    return res;
  }

}
