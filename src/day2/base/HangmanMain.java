package day2.base;

import java.util.Scanner;

public class HangmanMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Внесете збор:");
    String word = scanner.next();

    System.out.println("Внесете обиди:");
    int tries = scanner.nextInt();

    Hangman hangman = new Hangman(tries, word);

    for (int i = 0; i < 30; i++) {
      System.out.println();
    }

    while (!hangman.isGameOver()) {
      hangman.printDetails();

      String input = scanner.next();
      char letter = input.charAt(0);

      hangman.checkLetter(letter);
    }

    hangman.printGameOver();
  }
}
