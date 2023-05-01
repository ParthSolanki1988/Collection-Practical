package ArraylistPracticals;

/**
 * Point 1  : Create array list and iterate through loop.
 */
public class Customer {

  private String customerName ;
  private String email;
  private String password;


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public String toString() {
    return "Customer{" +
            "customerName='" + customerName + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
