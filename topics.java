
public class topics {
  // public static void main(String[] args) {

  // }

  public static void logical_relational() {
    // Relational Operators
    int a = 10;
    int b = 20;
    boolean c = a != b & a <= b;
    System.out.println(c);
    // if (a < b) {
    // System.out.println("Equal");
    // } else {
    // System.out.println("Not Equal");
    // }

    // Logical Operators - Short crcuiting
    int x = 10;
    int z = 20;
    boolean f = x > z || z >= x;
    System.out.println(f);
  }

  public static void switchStatement() {
    int k = 10;
    switch (k) {
      case 1 -> System.out.println("The value is 1");
      case 2 -> System.out.println("The value is 2");
      case 3 -> System.out.println("The value is 3");
      case 4 -> System.out.println("The value is 4");
      case 5 -> System.out.println("The value is 5");
      case 6 -> System.out.println("The value is 6");
      case 7 -> System.out.println("The value is 7");
      default -> System.out.println("Enter between 1 to 7");
    }
  }

  // Getting a value from the switch statement
  public static void switchStatement2() {
    int u = 22;
    int result = switch (u) {
      case 1 -> 1; // If we want to use : instead of -> , then we can write it as below
                   // [ case 1 : yield 1 ]
      case 2 -> 2;
      case 3 -> 3;
      case 4 -> 4;
      case 5 -> 5;
      case 6 -> 6;
      case 7 -> 7;
      default -> result = 0;
    };
    System.out.println(result);
  }

  // Using yield method in switch statement
  public static void switchStatement3() {
    int m = 1;
    String res = switch (m) {
      case 1:
        yield "Yash";
      case 2:
        yield "Sai";
      default:
        yield "No Name";
    };
    System.out.println(res);
  }

  public static void loops() {
    // for loop
    for (int i = 0; i < 2; i++) {
      // int i = 0;
      // for(;consition;) // also works
      System.out.println("Yashwanth sai chuppala");
    }

    // while
    int i = 1;
    while (i <= 5) {
      System.out.println("d value is: " + i);
      i++;
    }

    // do-while - used for running the do block atlest once even though the
    // condition is false
    int a = 5;
    do {
      System.out.println("yash");
    } while (a > 5); // false condition
  }
}

// CLASSES AND OBJECTS IN JAVA
class CallCalculator {
  public int add(int aVal, int bVal) {
    int r = aVal + bVal;
    return r;
  }
}

class Calculator {
  public static void main(String[] args) {

    int a = 10;
    int b = 20;
    // c is an object of callCalculator
    CallCalculator c = new CallCalculator();
    int result = c.add(a, b);
    System.out.println(result);
  }
}
