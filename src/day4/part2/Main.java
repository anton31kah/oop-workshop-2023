package day4.part2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();
    phonebook.addContact("Aleksandar", "070123456");
    phonebook.addContact("Marko", "078567890");
    phonebook.addContact("Ivana", "075246810");
    phonebook.addContact("Monika", "076357911");
    phonebook.addContact("Kristijan", "077951862");

    Scanner scanner = new Scanner(System.in);

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
