public class Constructors {
  public static void main(String[] args) {
    // Favourite fav = new Favourite("Shwetha", "chubby");
    // Favourite fav = new Favourite("yash");
    // Favourite fav2 = new Favourite("Kadiyam", "woman");
  }
}

class Favourite {
  String name;
  int mobile;
  String look;

  public Favourite(String name, String look) {
    this.name = name;
    this.look = look;
    System.out.println(this.name + " is a cute " + this.look);
  }

  public Favourite(String name) {
    this.name = name;
    System.out.println(this.name);
  }
}

class A extends Object {
  public A() {
    System.out.println("Inside the default constructor A");
  }

  public A(int n) {
    this();
    System.out.println("Inside param constuctor A : " + n);
  }
}

class B extends A {
  public B() {
    System.out.println("Inside the default constructor B");
  }

  public B(int n) {
    super(10);
    System.out.println("Inside the param Contructor B : " + n);
  }
}

class Demo {
  public static void main(String[] args) {
    // A a = new A(2);
  }
}