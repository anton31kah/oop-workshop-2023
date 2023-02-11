package day2.base;

import java.util.ArrayList;
import java.util.List;

public class Hangman {

  private int tries;
  private String wordToGuess;
  private List<Character> lettersToGuess;
  private List<Character> guessedLetters;
  private List<Character> maskedLetters;

  public Hangman(int tries, String word) {
    this.tries = tries;
    this.wordToGuess = word;

    this.lettersToGuess = new ArrayList<>();
    this.guessedLetters = new ArrayList<>();
    this.maskedLetters = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      this.lettersToGuess.add(word.charAt(i));
      this.maskedLetters.add('*');
    }
  }

  public boolean hasWon() {
    return !maskedLetters.contains('*');
  }

  public boolean isGameOver() {
    return tries == 0 || hasWon();
  }

  public void printDetails() {
    System.out.println("The word is: " + getMaskedWord() + " left tries: " + tries + " currently entered letters " + guessedLetters);
  }

  public void printGameOver() {
    if (hasWon()) {
      System.out.println("YOU WON!");
    } else {
      System.out.println("You lost, the word is " + wordToGuess);
    }
  }

  public void checkLetter(char letter) {
    if (guessedLetters.contains(letter)) {
      return;
    }

    guessedLetters.add(letter);

    for (int i = 0; i < lettersToGuess.size(); i++) {
      if (lettersToGuess.get(i) == letter) {
        maskedLetters.set(i, letter);
      }
    }

    if (!lettersToGuess.contains(letter)) {
      tries--;
    }
  }

  private String getMaskedWord() {
    String result = "";

    for (int i = 0; i < maskedLetters.size(); i++) {
      result += maskedLetters.get(i);
    }

    return result;
  }
}
