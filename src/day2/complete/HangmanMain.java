package day2.complete;

import java.util.Scanner;

public class HangmanMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Внесете збор:");
    String word = scanner.nextLine();
    word = word.toLowerCase();

    System.out.println("Внесете обиди:");
    int tries = readPositiveInteger(scanner);

    Hangman hangman = new Hangman(tries, word);

    for (int i = 0; i < 30; i++) {
      System.out.println();
    }

    while (!hangman.isGameOver()) {
      hangman.printDetails();

      String input = scanner.next();
      char letter = input.charAt(0);
      letter = Character.toLowerCase(letter);

      hangman.checkLetter(letter);
    }

    hangman.printGameOver();
  }

  private static int readPositiveInteger(Scanner scanner) {
    while (true) {
      String line = scanner.nextLine();
      if (!isInteger(line)) {
        System.out.println("Invalid value, enter a number please.");
        continue;
      }
      int number = Integer.parseInt(line);
      if (number <= 0) {
        System.out.println("Negative value, please enter a positive number.");
        continue;
      }
      return number;
    }
  }

  private static boolean isInteger(String value) {
    boolean isInteger = true;
    try {
      Integer.parseInt(value);
    } catch (NumberFormatException e) {
      isInteger = false;
    }
    return isInteger;
  }
}
