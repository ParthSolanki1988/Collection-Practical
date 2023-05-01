package HashSet;

/**
 * Point 3 :  Create hash map and iterate through loop.
 */
public class Employee{
  int employeeId;
  String employeeName;
  int salary;


  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "employeeId=" + employeeId +
            ", employeeName='" + employeeName + '\'' +
            ", salary=" + salary +
            '}';
  }
}
