package Problems.Arrays;

public class SearchI2D {
  public static void main(String[] args) {
    int nums[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int target = 3;
    int res[] = binarySearch(nums, target);
    for (int index : res) {
      System.out.println(index);
    }
  }

  // Time complexity = O(n^2)
  static int[] linearSearch(int nums[][], int target) {
    for (int rows = 0; rows < nums.length; rows++) {
      for (int columns = 0; columns <= nums.length; columns++) {
        if (target == nums[rows][columns]) {
          return new int[] { rows, columns };
        }
      }
    }
    return new int[] { -1, -1 };
  }

  // Time complexity = O(log n + log m)
  static int[] binarySearch(int nums[][], int target) {
    int row = 0;
    int col = nums.length - 1;
    int res[] = { -1, -1 };
    while (row >= 0 && col < nums.length && row <= col) {
      if (nums[row][col] == target) {
        return new int[] { row, col };
      }
      if (nums[row][col] < target) {
        row++;
      } else {
        col--;
      }
    }
    return res;
  }
}
