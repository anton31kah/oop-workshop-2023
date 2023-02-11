package day1;

public class Apartment {
  private boolean sold;
  private int number;
  private int size;
  private float price;

  public Apartment(boolean sold, int number, int size) {
    this.sold = sold;
    this.number = number;
    this.size = size;
  }

  public boolean isSold() {
    return sold;
  }

  public void setSold(boolean sold) {
    this.sold = sold;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public void printDetails() {
    if (!sold) {
      System.out.println("Apartment: " + number + " with size " + size + " with price " + price);
    }
  }
}
