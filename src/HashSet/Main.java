package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table are accessed using hash codes.
 */
public class  Main extends Employee {

  public static void main(String[] args){
    HashSet<Employee> employeeHashSet = new HashSet<Employee>();
    Scanner inputEmployee = new Scanner(System.in);
    char ans;

    while (true) {
      System.out.println("1) Employee Details \n2) Exit");
      int n = inputEmployee.nextInt();
      switch (n) {
        case 1:
          System.out.print("Enter Number of Employee : ");
          int number = inputEmployee.nextInt();
          for (int i = 0; i < number; i++) {
            Employee employee = new Employee();
            System.out.print("Enter Name : ");
            String employeeName = inputEmployee.next();
            System.out.print("Enter Employee Id : ");
            int employeeId = inputEmployee.nextInt();
            System.out.print("Enter Employee Salary : ");
            int employeeSalary = inputEmployee.nextInt();

            employee.setEmployeeName(employeeName);
            employee.setEmployeeId(employeeId);
            employee.setSalary(employeeSalary);

            employeeHashSet.add(employee);

          }
          /**
           * directly print hashset
           */
          //System.out.println(employeeHashSet);

          /**
           * using foreach and lambda expression
           */
//    employeeHashSet.forEach( (employee) -> System.out.println(employee));

          /**
           * using foreach loop
           */
          //for (Employee e: employeeHashSet) {
          //  System.out.println(e);
          //}

          Object[] employees = employeeHashSet.toArray();
          for (Object empl: employees) {
            System.out.println(empl);
          }

          /**
           * using Iterator loop
           */
          Iterator<Employee> employeeIterator = employeeHashSet.iterator();
          while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
          }
      }
    }
  }
}
