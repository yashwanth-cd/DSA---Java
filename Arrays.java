public class Arrays {
  public static void main(String[] args) {
    // --------------> 1D array
    // syntax 1
    // int nums3[] = new int[5]; // [0, 0, 0, 0, 0]

    // syntax 2
    int nums[] = { 1, 2, 3, 4, 5 };
    // int[] nums1 = { 1, 2, 3, 4, 5 };

    // retrieve the array values
    System.out.println(nums[0]); // 1
    System.out.println(nums[1]); // 2

    // Change the values
    nums[0] = 100;
    nums[1] = 200;
    System.out.println(nums[0]); // 100
    System.out.println(nums[1]); // 200

    // Looping through an array with enhanced for-loop
    for (int value : nums) {
      System.out.print(value + " "); // 100 200 3 4 5
    }

    // --------------> 2D array
    int nums2D[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
    // int nums2D[][] = new int[3][3];

    // retrieve the 2d array values
    System.out.println();
    System.out.println(nums2D[0][0]); // 1
    System.out.println(nums2D[0][1]); // 2

    // change the 2D array values
    nums2D[0][1] = 10;
    nums2D[1][1] = 20;

    // lopping through the 2D array
    // i = rows, j = columns
    for (int i = 0; i < nums2D.length; i++) {
      for (int j = 0; j <= nums2D.length; j++) {
        System.out.print(nums2D[i][j] + " ");
      }
      System.out.println();
    }
  }
}
