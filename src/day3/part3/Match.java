package day3.part3;

import java.util.ArrayList;
import java.util.List;

public class Match {
  private Team homeTeam;
  private Team awayTeam;
  private List<Player> homeScorers;
  private List<Player> awayScorers;
  private boolean finished;

  public Match(Team homeTeam, Team awayTeam) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.homeScorers = new ArrayList<>();
    this.awayScorers = new ArrayList<>();
    this.finished = false;
  }

  public void printDetails() {
    System.out.println(getHomeTeamName() + " " + getHomeGoals() + ":" + getAwayGoals() + " " + getAwayTeamName() + " - " + getStatus());
    printScorers(homeScorers, "Home Scorers: ");
    printScorers(awayScorers, "Away Scorers: ");
    System.out.println();
  }

  public void printScorers(List<Player> players, String prefix) {
    if (!players.isEmpty()) {
      System.out.print(prefix);
      for (int i = 0; i < players.size(); i++) {
        players.get(i).printDetails();
        if (i < players.size() - 1) {
          System.out.print(", ");
        }
      }
      System.out.println();
    }
  }

  public String getHomeTeamName() {
    if (!finished) {
      return homeTeam.getName();
    }

    if (getHomeGoals() > getAwayGoals()) {
      return homeTeam.getName().toUpperCase();
    } else {
      return homeTeam.getName();
    }
  }

  public String getAwayTeamName() {
    if (!finished) {
      return awayTeam.getName();
    }

    if (getAwayGoals() > getHomeGoals()) {
      return awayTeam.getName().toUpperCase();
    } else {
      return awayTeam.getName();
    }
  }

  public String getStatus() {
    if (finished) {
      return "finished";
    } else {
      return "ongoing";
    }
  }

  public Team getHomeTeam() {
    return homeTeam;
  }

  public Team getAwayTeam() {
    return awayTeam;
  }

  public int getHomeGoals() {
    return homeScorers.size();
  }

  public int getAwayGoals() {
    return awayScorers.size();
  }

  public boolean isFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  public void addHomeScorer(Player player) {
    this.homeScorers.add(player);
  }

  public void addAwayScorer(Player player) {
    this.awayScorers.add(player);
  }
}
