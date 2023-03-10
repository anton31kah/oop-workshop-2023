package day3.part2;

public class Player {

  private String name;
  private String position;

  public Player(String name, String position) {
    this.name = name;
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public void printDetails() {
    System.out.print(name + " (" + position + ")");
  }
}
