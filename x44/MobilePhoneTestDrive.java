public class MobilePhoneTestDrive{
  public static void main(String[] args){
    MobilePhone phone = new MobilePhone("99536728");
    phone.addNewContact(new Contact("Bob", "12498712"));
    phone.addNewContact(new Contact("Alice", "024143200"));
    phone.addNewContact(new Contact("Tom", "34293492"));
    phone.addNewContact(new Contact("Jane", "41298473"));
    phone.printContacts();

    phone.updateContact(phone.queryContact("Bob"), new Contact("Bob", "0000000"));

    phone.removeContact(phone.queryContact("Jane"));
    phone.printContacts();

    System.out.println("findcontact: "+ phone.findContact(new Contact("Alice", "41298473")));

    System.out.println("querycontact: "+phone.queryContact("Tom"));
  }
}
