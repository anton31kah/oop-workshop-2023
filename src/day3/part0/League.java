package day3.part0;

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
}
