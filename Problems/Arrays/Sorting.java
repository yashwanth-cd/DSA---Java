package Problems.Arrays;

public class Sorting {
  public static void main(String[] args) {
    int nums[] = { -1, -9, -345, 5, 5, 2, 1, 9, 0, 6, 3, 4 };
    int n = nums.length;
    int res[] = mergeSort(nums, 0, n - 1);
    for (int val : res) {
      System.out.print(val + "  ");
    }
  }

  // Time complexity = O(n^2)
  static int[] selectionSort(int nums[]) {
    for (int i = 0; i <= nums.length - 2; i++) {
      int smallest = i;
      for (int j = i + 1; j <= nums.length - 1; j++) {
        if (nums[smallest] > nums[j]) {
          smallest = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[smallest];
      nums[smallest] = temp;
    }
    return nums;
  }

  // Time complexity = O(n^2)
  static int[] bubbleSort(int nums[]) {
    boolean swapped;
    for (int i = 0; i < nums.length - 1; i++) {
      swapped = false;
      for (int j = 0; j < nums.length - 1 - i; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
          swapped = true;
        }
      }
      if (swapped == false) {
        break;
      }
    }
    return nums;
  }

  // Time complexity = O(n^2)
  static int[] insertionSort(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      int j = i;
      while (j > 0 && nums[j - 1] > nums[j]) {
        int temp = nums[j];
        nums[j] = nums[j - 1];
        nums[j - 1] = temp;
        j--;
      }
    }
    return nums;
  }

  // Time complexity = O(n log n)
  static int[] mergeSort(int nums[], int low, int high) {
    if (low >= high)
      return nums;
    int mid = low + (high - low) / 2;
    mergeSort(nums, low, mid);
    mergeSort(nums, mid + 1, high);
    merge(nums, low, mid, high);
    return nums;
  }

  static void merge(int nums[], int low, int mid, int high) {
    int newArr[] = new int[high - low + 1];
    int left = low; // Array 1
    int right = mid + 1; // Array 2
    int i = 0;
    while (left <= mid && right <= high) {
      if (nums[left] <= nums[right]) {
        newArr[i] = nums[left];
        i++;
        left++;
      } else {
        newArr[i] = nums[right];
        i++;
        right++;
      }
    }

    while (left <= mid) {
      newArr[i] = nums[left];
      left++;
      i++;
    }

    while ((right <= high)) {
      newArr[i] = nums[right];
      i++;
      right++;
    }

    for (int x = 0, j = low; x < newArr.length; x++, j++) {
      nums[j] = newArr[x];
    }
  }

  // Time complexity = O(n log n)
  static int[] quickSort(int nums[], int low, int high) {
    if (low < high) {
      int partition = partitionArr(nums, low, high);
      quickSort(nums, low, partition - 1);
      quickSort(nums, partition + 1, high);
    }
    return nums;
  }

  static int partitionArr(int nums[], int low, int high) {
    int pivot = nums[low];
    int i = low;
    int j = high;
    while (i < j) {

      // Traverse the i to the element less than pivot, left to right
      while (nums[i] <= pivot && i <= high - 1) {
        i++;
      }

      // Traverse the j to the element greater than pivot, right to left
      while (nums[j] > pivot && j >= low + 1) {
        j--;
      }

      // Swaping the elements using i and j indexes
      if (i < j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
    }
    // Put the pivot element in the j position and j element in pivot position
    int temp = nums[low]; // pivot in nums[low]
    nums[low] = nums[j]; // putting jth element in pivot position
    nums[j] = temp; // putting pivot at jth position

    // Returning the pivot index as partition
    return j;
  }
}
