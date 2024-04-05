public class literals {
  public static void main(String[] args) {
    // more readable and pints the value normally
    int num = 100_000_000;

    // get binary value
    int num2 = 0b101;
    int num3 = 0x1FE;
    System.out.println(num);
    System.out.println(num2);
    System.out.println(num3);

    // type conversion and casting
    byte b = 127;
    int a = 12;
    // byte has less space than int so this doesnt work
    // b = a;
    b = (byte) a; // casting
    // this works as byte is being stored in int value
    a = b; // conversion

    // float to int - the . value will be removed
    float f = 12.6f;
    int i = (int) f; // .6 gets removed
    System.out.println(i);

    // storing byte in int using type casting
    int x = 10;
    byte z = (byte) x;
    System.out.println(z);

    // Type promotion - when the result of some type is increased more than its
    // space
    byte p = 10;
    byte j = 30;
    int res = p * j;
    System.out.println(res);
  }
}
