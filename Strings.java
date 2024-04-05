public class Strings {
  public static void main(String[] args) {
    // Syntax 1
    String name = "Yash";

    // Syntax 2 using the String Object
    String name2 = new String("Yash");
    // String name3 = new String(); // Empty String Object

    // printing the values of both variables
    System.out.println(name); // Yash
    System.out.println(name2); // Yash
    // System.out.println(name3); // blank space as String object is empty

    // Some methods of Strings in java
    System.out.println(name.charAt(0)); // Y
    System.out.println(name.substring(2)); // sh
    System.out.println(name.length()); // 4
    System.out.println(name.substring(0, 2)); // Ya
    System.out.println(name.indexOf("Y")); // 0
    System.out.println(name.compareTo(name2)); // true = 0, false = -1
    System.out.println(name.contains("Y")); // true
    System.out.println(name.endsWith("h")); // true
    System.out.println(name.startsWith("Y")); // true;
    System.out.println(name.concat(name2)); // YashYash

    // StringBuffer [ for string mutations ] and StringBuilder
    StringBuffer s = new StringBuffer("Yash");
    System.out.println(s.capacity()); // 20
    System.out.println(s.length()); // 1

    // Changing the string in StringBuffer
    s.append("wanth");
    System.out.println(s); // Yashwanth

    // Insert into the existing string
    s.insert(0, "Chuppala ");

    // Delete in StringBuffer
    s.delete(0, 1);
    System.out.println(s); // huppala Yashwanth

    // Set a minimum capacity to the StringBuffer
    s.ensureCapacity(100);
    System.out.println(s.capacity()); // 100

  }
}
