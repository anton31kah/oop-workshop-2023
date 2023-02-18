package day3.part2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Player 1", "AMF");
    Player player2 = new Player("Player 2", "AMF");
    Player player3 = new Player("Player 3", "AMF");
    Player player4 = new Player("Player 4", "AMF");
    Player player5 = new Player("Player 5", "AMF");
    Player player6 = new Player("Player 6", "AMF");

    Team team1 = new Team("Team 1");
    Team team2 = new Team("Team 2");
    Team team3 = new Team("Team 3");
    Team team4 = new Team("Team 4");
    Team team5 = new Team("Team 5");
    Team team6 = new Team("Team 6");
    Team team7 = new Team("Team 7");
    Team team8 = new Team("Team 8");
    Team team9 = new Team("Team 9");
    Team team10 = new Team("Team 10");
    Team team11 = new Team("Team 11");
    Team team12 = new Team("Team 12");

    Match match1 = new Match(team1, team2);
    Match match2 = new Match(team3, team4);
    Match match3 = new Match(team5, team6);
    Match match4 = new Match(team7, team8);
    Match match5 = new Match(team9, team10);
    Match match6 = new Match(team11, team12);

    match3.addAwayScorer(player1);
    match3.addAwayScorer(player2);

    match4.addAwayScorer(player3);
    match4.addAwayScorer(player3);
    match4.addAwayScorer(player3);
    match4.addAwayScorer(player4);
    match4.setFinished(true);

    match5.addHomeScorer(player5);
    match5.addAwayScorer(player6);
    match5.setFinished(true);

    List<Match> matches = new ArrayList<>();
    matches.add(match1);
    matches.add(match2);
    matches.add(match3);
    matches.add(match4);
    matches.add(match5);
    matches.add(match6);

    League league = new League(matches);

    league.printDetails();
  }
}
