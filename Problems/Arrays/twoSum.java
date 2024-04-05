package Problems.Arrays;

import java.util.Arrays;

public class twoSum {
  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 7, 11, 14 };
    int n = arr.length;
    int target = 11;
    if (hasArrayTwoCandidates(arr, n, target))
      System.out.println("Array has two elements with the given sum");
    else
      System.out.println("Array doesn't have two elements with the given sum");
  }

  //////////////// BRUTE FORCE METHOD
  // Time complexity = O(n^2)
  // Space complexity = O(1)
  public int[] twoSumBrute(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (target == (nums[i] + nums[j]))
          return new int[] { i, j };
      }
    }
    return new int[] { -1, -1 };
  }

  //////////////// OPTIMISED METHOD USING SORTING AND POINTERS
  // Time complexity = O(n log n)
  // Space complexity = O(1)
  static boolean twoSumSortAndPointer(int nums[], int target, int len) {
    int sortedArr[] = sort(nums, 0, len - 1);
    // Arrays.sort(nums);
    int left = 0;
    int right = len - 1;
    while (left <= right) {
      if (target < (sortedArr[left] + sortedArr[right])) {
        right--;
      } else if (target > (sortedArr[left] + sortedArr[right])) {
        left++;
      } else {
        return true;
      }
    }
    return false;
  }

  static int[] sort(int nums[], int low, int high) {
    if (low >= high) {
      return nums;
    }
    // Finding the mid element to divide the array into 2 parts
    int mid = low + (high - low) / 2;
    sort(nums, low, mid);
    sort(nums, mid + 1, high);
    merge(nums, low, mid, high);
    return nums;
  }

  static int[] merge(int nums[], int low, int mid, int high) {
    int left = low;
    int right = mid + 1;
    int i = 0;
    int newArr[] = new int[high - low + 1];
    while (left <= mid && right <= high) {

      // Traverse the left array from left to right and check for the least value
      if (nums[left] < nums[right]) {
        newArr[i++] = nums[left++];
      } else {
        newArr[i++] = nums[right++];
      }
    }
    while (left <= mid) {
      newArr[i++] = nums[left++];
    }
    while (right <= high) {
      newArr[i++] = nums[right++];
    }

    // transfer the newArr elements to the nums array
    for (int j = 0, x = low; j < newArr.length; j++, x++) {
      nums[x] = newArr[j];
    }
    return nums;
  }

  /////////////// OPTIMIZED METHOD USING SORT AND BINARY SEARCH
  static boolean hasArrayTwoCandidates(int[] arr, int n, int target) {
    Arrays.sort(arr); // Sorting the array
    for (int i = 0; i < n - 1; i++) {
      int index = binarySearch(arr, i + 1, n - 1, target - arr[i]);
      if (index != -1) {
        return true;
      }
    }
    return false;
  }

  // Binary search function to find the target in the sorted subarray
  static int binarySearch(int[] arr, int low, int high, int target) {
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

}
