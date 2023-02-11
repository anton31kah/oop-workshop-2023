package day1;

public class Building {
  private String street;
  private Floor floor1;
  private Floor floor2;
  private Floor floor3;

  public Building(String street, Floor floor1, Floor floor2, Floor floor3) {
    this.street = street;
    this.floor1 = floor1;
    this.floor2 = floor2;
    this.floor3 = floor3;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Floor getFloor1() {
    return floor1;
  }

  public void setFloor1(Floor floor1) {
    this.floor1 = floor1;
  }

  public Floor getFloor2() {
    return floor2;
  }

  public void setFloor2(Floor floor2) {
    this.floor2 = floor2;
  }

  public Floor getFloor3() {
    return floor3;
  }

  public void setFloor3(Floor floor3) {
    this.floor3 = floor3;
  }

  public void printDetails() {
    System.out.println("Street name " + street);
    floor1.printDetails();
    floor2.printDetails();
    floor3.printDetails();
  }
}
