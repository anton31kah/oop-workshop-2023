package day4.part2;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
  private List<Contact> contactList;

  public Phonebook() {
    this.contactList = new ArrayList<>();
  }

  public void addContact(String name, String phoneNumber) {
    contactList.add(new Contact(name, phoneNumber));
  }

  public void updateNumber(int index, String number) {
    contactList.get(index).setPhoneNumber(number);
  }

  public boolean hasContactAtIndex(int index) {
    return index >= 0 && index < contactList.size();
  }

  public void printDetails() {
    for (int i = 0; i < contactList.size(); i++) {
      Contact contact = contactList.get(i);
      System.out.println(i + ") " + contact.getName() + ": " + contact.getPhoneNumber());
    }
  }
}
