public class Contact{
  String name;
  String phoneNumber;
  public Contact(String n, String number){
    name = n;
    phoneNumber = number;
  }
  public String getName(){
    return name;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }
  public static Contact createContact(String name, String number){
    return new Contact(name, number);
  }
  
}
