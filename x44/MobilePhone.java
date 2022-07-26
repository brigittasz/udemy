import java.util.ArrayList;
public class MobilePhone{
  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String number){
    myContacts = new ArrayList<Contact>();
    myNumber = number;
  }
  public boolean addNewContact(Contact c){
    return myContacts.add(c);
  }
  public boolean updateContact(Contact old, Contact n){
    int index = myContacts.indexOf(old);
    if(index>-1){
      myContacts.set(index, n);
      return true;
    } else {
      return false;
    }
  }
  public boolean removeContact(Contact c){
    return myContacts.remove(c);
  }
  public int findContact(Contact c){
    return myContacts.indexOf(c);
  }
  public int findContact(String s){
    for(Contact c: myContacts){
      if(c.getName().equals(s)){
        return 0;
      }
    }
    return -1;
  }
  public Contact queryContact(String s){
    for(Contact c: myContacts){
      if(c.getName().equals(s)){
        return c;
      }
    }
    return null;
  }
  public void printContacts(){
    System.out.println("Contact List: ");
    int i = 1;
    for(Contact contact: myContacts){
      System.out.println(i+". "+contact.getName()+" -> "+ contact.getPhoneNumber());
      i++;
    }
  }
}
