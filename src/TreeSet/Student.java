package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Point 4 : Create tree map and iterate through loop.
 */
public class Student implements Comparable<Student>{
  String studentName;
  int studentId;

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  @Override
  public String toString() {
    return "Student{" +
            "studentName='" + studentName + '\'' +
            ", studentId=" + studentId +
            '}';
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
//    Student student = new Student();
//    student.setStudentName("Parth");
//    student.setStudentId(101);
//
//    System.out.println(treeSet);

    while (true) {
      TreeSet<Student> treeSet = new TreeSet<>();
      System.out.println("1) Student Details \n2) Exit");
      int n = input.nextInt();
      switch (n) {
        case 1:
          System.out.print("Enter Number of Student : ");
          int number = input.nextInt();
          for (int i = 0; i < number; i++) {
            Student student = new Student();
            System.out.print("Enter Name : ");
            String studentName = input.next();
            System.out.print("Enter Student Id : ");
            int studentId = input.nextInt();

            student.setStudentName(studentName);
            student.setStudentId(studentId);

            treeSet.add(student);
          }
      }
      System.out.println(treeSet);
    }

//    treeSet.add("Parth");
//    treeSet.add("Jay");
//    treeSet.add("Amit");
//    treeSet.add("zeel");
//    treeSet.add("Axar");
//    treeSet.add("Smith");
//    treeSet.add("Harsh");
//
//    System.out.println(treeSet);
//    System.out.println(treeSet.descendingSet());
//    System.out.println(treeSet.headSet("Parth" , true));
//    System.out.println(treeSet.subSet("Harsh" , "Smith"));
//    System.out.println(treeSet.tailSet("Axar" , false));
  }

  @Override
  public int compareTo(Student o) {
    if(studentId==o.studentId)
      return 0;
    else if(studentId>o.studentId)
      return 1;
    else
      return -1;

  }
}
