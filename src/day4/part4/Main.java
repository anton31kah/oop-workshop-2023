package day4.part4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Phonebook phonebook = new Phonebook();

    System.out.println("Do you want to enter the contacts manually? Type 'yes' or skip to have automatic contacts");
    String enterContactsManually = scanner.nextLine();
    enterContactsManually = enterContactsManually.toLowerCase();

    if (enterContactsManually.equals("yes")) {
      while (true) {
        System.out.println("Enter the contact name or 'done' to stop!");

        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("done")) {
          break;
        }

        if (name.isBlank()) {
          System.out.println("Invalid input!");
          continue;
        }

        String number = scanner.nextLine();
        if (number.isBlank()) {
          System.out.println("Invalid input!");
          continue;
        }

        phonebook.addContact(name, number);
      }
    } else {
      phonebook.addContact("Aleksandar", "070123456");
      phonebook.addContact("Marko", "078567890");
      phonebook.addContact("Ivana", "075246810");
      phonebook.addContact("Monika", "076357911");
      phonebook.addContact("Kristijan", "077951862");
    }

    while (true) {
      System.out.println("enter input in format: 'index newphonenumber' to update phone contact. note the space");
      System.out.println("if you are done with updating, type 'done'");
      phonebook.printDetails();

      String line = scanner.nextLine();
      line = line.toLowerCase();

      if (line.equals("done")) {
        break;
      }

      String[] parts = line.split(" ");

      if (parts.length != 2) {
        System.out.println("Invalid input!");
        continue;
      }

      if (!isInteger(parts[0])) {
        System.out.println("Invalid input!");
        continue;
      }

      int index = Integer.parseInt(parts[0]);

      if (!phonebook.hasContactAtIndex(index)) {
        System.out.println("Invalid input!");
        continue;
      }

      String newNumber = parts[1];

      phonebook.updateNumber(index, newNumber);

      System.out.println("Do you also want to change the contact name? Type 'yes' to confirm.");
      String nameChangeConfirm = scanner.nextLine();
      nameChangeConfirm = nameChangeConfirm.toLowerCase();

      if (nameChangeConfirm.equals("yes")) {
        System.out.println("Please enter the new name!");
        String newName = scanner.nextLine();
        if (!newName.isBlank()) {
          phonebook.updateName(index, newName);
        } else {
          System.out.println("Invalid input!");
        }
      }
    }
  }

  public static boolean isInteger(String value) {
    try {
      Integer.parseInt(value);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
