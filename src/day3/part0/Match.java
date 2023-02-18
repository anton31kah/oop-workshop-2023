package day3.part0;

public class Match {
  private Team homeTeam;
  private Team awayTeam;
  private int homeGoals;
  private int awayGoals;
  private boolean finished;

  public Match(Team homeTeam, Team awayTeam) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.homeGoals = 0;
    this.awayGoals = 0;
    this.finished = false;
  }

  public void printDetails() {
    System.out.println(homeTeam.getName() + " " + homeGoals + ":" + awayGoals + " " + awayTeam.getName() + " - " + getStatus());
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
    return homeGoals;
  }

  public int getAwayGoals() {
    return awayGoals;
  }

  public boolean isFinished() {
    return finished;
  }

  public void setHomeGoals(int homeGoals) {
    this.homeGoals = homeGoals;
  }

  public void setAwayGoals(int awayGoals) {
    this.awayGoals = awayGoals;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }
}
