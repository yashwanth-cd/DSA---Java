import java.util.*;

public class CollectionInJava {
  public static void main(String[] args) {
    // Collection is used to store and retrieve the data
    // Creating an ArrayList Class of Collection Interface
    // Integer is a class, where as int is a primitive
    Collection<Integer> nums = new ArrayList<Integer>();

    // Adding values into the ArrayList

    nums.add(12);
    nums.add(32);
    nums.add(12);
    nums.add(65);
    // nums.add("34"); ❌ Gives an error as nums object is Integer type

    // Printing the values of ArrayList
    System.out.println(nums);

    // Cannot use index values for collection interface
    // Printing using the for loop
    for (Integer val : nums) {
      System.out.println(val);
    }

    // Calling the arraylist method
    methodsInArrayList();

  }

  // Creating an Arraylist using the List Interface
  // List is used when we want to work with index values
  static void arrayListUsingList() {
    // Creating ArrayList
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(100);
    nums.add(200);
    nums.add(300);

    int first = nums.get(0); // 100
    int indexOfValue = nums.indexOf(200); // 1
    System.out.println(first);
    System.out.println(indexOfValue);
  }

  static void methodsInArrayList() {
    // Some Methods of ArrayList class
    // Creating an ArrayList
    List<Integer> nums = new ArrayList<Integer>();

    // Adding values to the ArrayList
    nums.add(12);
    nums.add(3745);
    nums.add(65);
    nums.add(21);

    // Retrieve elements from ArrayList
    System.out.println(nums.get(0)); // 12

    // check for an element existence
    System.out.println(nums.contains(65)); // true

    // check if ArrayList is empty
    System.out.println(nums.isEmpty()); // fasle

    // Retrieve the index of the value
    System.out.println(nums.indexOf(32)); // -1
    System.out.println(nums.indexOf(12)); // 0

    // To get the size of the ArrayList
    System.out.println(nums.size()); // 3

    // Displaying the values in ArrayList using toString()
    System.out.println(nums.toString()); // [12, 65, 21]

    // Displaying the values in ArrayList directly
    System.out.println(nums); // [12, 65, 21]

    // Add elements at a specific position
    nums.add(0, 100); // [100, 65, 21]

    // Change value at a specific position
    nums.set(3, 3000);
    System.out.println(nums); // [100, 65, 21, 3000]

    // Removing an element from the ArrayList
    nums.remove(0);
    System.out.println(nums); // [12, 65, 3000]

    // Iterating through the ArrayList
    for (int i = 0; i < nums.size(); i++) {
      System.out.print(nums.get(i) + " ");
    }
    System.out.println();

    // Using enhanced for-loop
    for (int val : nums) {
      System.out.print(val + " ");
    }
    System.out.println();
    // Sorting the elements in the ArrayList
    ArrayList<Integer> nums2 = new ArrayList<Integer>();
    nums2.add(4765);
    nums2.add(123);
    nums2.add(32);
    Collections.sort(nums2);
    System.out.println(nums2);
  }
}

class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int len = findLength(str);
    System.out.println(len);
    String upper = upperCaseStr(str);
    System.out.println(upper);
    sc.close();
  }

  // length
  static int findLength(String str) {
    return str.length();
  }

  // string to uppercase
  static String upperCaseStr(String str) {
    return str.toUpperCase();
  }

}