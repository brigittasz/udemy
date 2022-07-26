import java.util.ArrayList;
public class Branch{
  String name;
  ArrayList<Customer> customers;

  public Branch(String name){
    this.name = name;
    customers = new ArrayList<Customer>();
  }
  public String getName(){
    return name;
  }
  public ArrayList<Customer> getCustomers(){
    return customers;
  }
  //returns true if customer was added successfully
  public boolean newCustomer(String name, double transaction){
    return customers.add(new Customer(name, transaction));
  }
  //returns true if customer transaction was added
  public boolean addCustomerTransaction(String name, double transaction){
    Customer customer = this.findCustomer(name);
    if(customer==null){
      //System.out.println("Adding new customer");
      return this.newCustomer(name, transaction);
    } else {
      customer.addTransaction(transaction);
      return true;
    }
  }
  //returns a customer
  public Customer findCustomer(String name){
    for(Customer customer: customers){
      if(customer.getName().equals(name)){
        return customer;
      }
    }
    return null;
  }
}
