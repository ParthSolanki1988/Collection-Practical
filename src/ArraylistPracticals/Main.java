package ArraylistPracticals;


import java.util.*;
public class Main{
  public static void main(String[] args) {


    /**
     * create customer ArrayList
     */
    ArrayList<Customer> customerArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    /**
     * create empty arrayList1
     */
    ArrayList<Customer> arrayList1 = new ArrayList<Customer>();



    while (true) {
      System.out.println("1) Customer Details \n2) Exit");
      int n = scanner.nextInt();
      switch (n) {
        case 1:
          System.out.print("Enter Number of Customer : ");
          int number = scanner.nextInt();
          for (int i = 0; i < number; i++) {
            Customer customer = new Customer();
            System.out.print("Enter Name : ");
            String customerName = scanner.next();
            System.out.print("Enter Customer Email : ");
            String customerEmail = scanner.next();
            System.out.print("Enter Customer Password : ");
            String customerPassword = scanner.next();

            customer.setCustomerName(customerName);
            customer.setEmail(customerEmail);
            customer.setPassword(customerPassword);

            customerArrayList.add(customer);
          }
//          System.out.println(customerArrayList);

          /**
           * Iterate using Iterator loop
           */
          Iterator<Customer> iterator = customerArrayList.iterator();
          while (iterator.hasNext()){
            System.out.println(iterator.next());
          }

          /**
           * arrayList is not empty
           * arrayList1 is empty
           * that's why not equals
           */
          System.out.println( "Arraylist equals Arraylist1 ? = " + customerArrayList.equals(arrayList1));

          /**
           * clear arrayList
           */
          System.out.print("when we clear arraylist :  ");
          customerArrayList.clear();
          System.out.println(customerArrayList);
          break;


        case 2:
          System.out.println("Bye Bye !!");
          System.exit(0);
          break;
      }
    }
  }
}







