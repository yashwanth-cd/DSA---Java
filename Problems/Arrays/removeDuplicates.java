package Problems.Arrays;

public class removeDuplicates {
  public static void main(String[] args) {
    int nums[] = { 1, 1, 2, 2, 3, 4, 5, 6, 6, 6 };
    int len = nums.length;
    int res[] = removeDupeOptimal(nums, len);
    for (int val : res) {
      System.out.println(val);
    }
  }

  /////// BRUTEFORCE
  // Time complexity = O(n)
  static int[] removeDupeBrute(int nums[], int len) {
    int unique[] = new int[len];
    int j = 0;
    for (int i = 0; i < len - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        unique[j] = nums[i];
        j++;
      }
      unique[j] = nums[len - 1];
    }
    return unique;
  }

  ///////// REMOVING THE DUPLICATE ELEMENTS USING 2 POINTER METHOD
  // Time complexity = O(n)
  static int[] removeDupeOptimal(int nums[], int len) {
    int first = 0;
    // int second = 1;
    for (int i = 1; i < len; i++) {
      if (nums[first] != nums[i]) {
        nums[first + 1] = nums[i];
        // second = i;
        first++;
      }
    }
    return nums;
  }
}
