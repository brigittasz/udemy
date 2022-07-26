import java.util.ArrayList;
public class Bank{
  String name;
  ArrayList<Branch> branches;
  public Bank(String n){
    name = n;
    branches = new ArrayList<Branch>();
  }
  public boolean addBranch(String name){
    return branches.add(new Branch(name));
  }
  //adds customer
  public boolean addCustomer(String bname, String cname, double transaction){
    return this.findBranch(bname).addCustomerTransaction(cname, transaction);
  }
  //adds transaction
  public boolean addCustomerTransaction(String bname, String cname, double transaction){
    return this.findBranch(bname).addCustomerTransaction(cname, transaction);
  }
  //returns branch with name
  public Branch findBranch(String name){
    for(Branch branch: branches){
      if(branch.getName().equals(name)){
        return branch;
      }
    }
    return null;
  }
  //print all customers of Bank
  public boolean listCustomers(String name, boolean printTransaction){
    if(printTransaction == true){
      for(Branch branch: branches){
        System.out.print("Customer details for branch "+branch.getName()+" \n");
        ArrayList<Customer> customers = branch.getCustomers();
        int c_index = 1;
        for(Customer customer: customers){
          System.out.print("Customer: "+ customer.getName()+"["+c_index+"]\n");
          int t_index = 1;
          ArrayList<Double> transactions = customer.getTransactions();
          System.out.println("Transactions\n");
          for(Double transaction: transactions){
            System.out.println("["+t_index+"] Amount "+transaction);
            t_index++;
          }
        }
        c_index++;
        return true;
      }
    } else {
      for(Branch branch: branches){
        System.out.print("Customer details for branch Adelaide \n");
        ArrayList<Customer> customers = branch.getCustomers();
        int c_index = 1;
        for(Customer customer: customers){
          System.out.println("Customer: "+customer.getName()+"["+c_index+"]");
          c_index++;
        }
      }
    }
    return false;
  }
}
