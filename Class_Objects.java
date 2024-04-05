class House {
  public String closeDoor() {
    return "Door closed";
  }

  public int watchClock(int time) {
    if (time > 0 && time <= 24)
      return time;
    return 0;
  }

  public void nothing() {
    System.out.println("Inside of nothing method");
  }

  // METHOD OVERLOADING
  public int add(int a, int b) {
    return a + b;
  }

  public String add(String a, String b) {
    return a + b;
  }

  public double add(int a, int b, int c) {
    return a + b + c;
  }
}

class Class_Objects {
  public static void main(String[] args) {
    // CREATING THE OBJECT OF HOUSE
    House obj = new House();
    String result = obj.closeDoor();
    int result1 = obj.watchClock(25);
    System.out.println(result);
    System.out.println(result1);

    // Calling the method overloaded functions
    int resInt = obj.add(12, 23);
    String resString = obj.add("Yash", "Sai");
    double resDouble = obj.add(12, 23, 35);
    System.out.println(resInt);
    System.out.println(resString);
    System.out.println(resDouble);
  }
}