
public class ArrayOfObjs {
  public static void main(String[] args) {
    // Creating the objects of the class Student
    Student s1 = new Student();
    s1.hallTicket = "21845A0523";
    s1.name = "Yashwanth Sai";
    s1.phnNo = "9390171928";

    Student s2 = new Student();
    s2.hallTicket = "21845A0500";
    s2.name = "Yudvir";
    s2.phnNo = "9390176542";

    Student s3 = new Student();
    s3.hallTicket = "21845A0400";
    s3.name = "Yoshna";
    s3.phnNo = "9390176534";

    // Creating an array of Objects
    // Student students[] = new Student[3];
    Student students[] = { s1, s2, s3 };

    // retrieving the array's object details
    for (Student obj : students) {
      System.out.print(obj.hallTicket + " ");
      System.out.print(obj.name + " ");
      System.out.print(obj.phnNo + " ");
      System.out.println();
    }
  }
}

class Student {
  String hallTicket;
  String name;
  String phnNo;
}