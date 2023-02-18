package day3.part3;

import java.util.ArrayList;
import java.util.List;

public class Team {
  private String name;
  private List<Player> players;

  public Team(String name) {
    this.name = name;
    this.players = new ArrayList<>();
  }

  public String getName() {
    return name;
  }
}
