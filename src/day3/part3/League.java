package day3.part3;

import java.util.List;

public class League {
  private List<Match> matches;

  public League(List<Match> matches) {
    this.matches = matches;
  }

  public void printDetails() {
    for (int i = 0; i < matches.size(); i++) {
      matches.get(i).printDetails();
    }
  }

  public void printOrdered() {
    System.out.println("Finished matches:");
    for (int i = 0; i < matches.size(); i++) {
      if (matches.get(i).isFinished()) {
        matches.get(i).printDetails();
      }
    }
    System.out.println("---------------------------");
    System.out.println("Ongoing matches:");
    for (int i = 0; i < matches.size(); i++) {
      if (!matches.get(i).isFinished()) {
        matches.get(i).printDetails();
      }
    }
  }
}
