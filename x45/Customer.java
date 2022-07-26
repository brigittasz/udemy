import java.util.ArrayList;
public class Customer{
    String name;
    ArrayList<Double> transactions;
    public Customer(String name, double transaction){
      this.name = name;
      transactions = new ArrayList<Double>();
      this.addTransaction(transaction);
    }
    public String getName(){
      return name;
    }
    public ArrayList<Double> getTransactions(){
      return transactions;
    }
    public void addTransaction(double transaction){
      transactions.add(transaction);
      //System.out.println("Added customer transaction");
    }
}
