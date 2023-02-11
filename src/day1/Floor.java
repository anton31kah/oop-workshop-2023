package day1;

public class Floor {
  private Apartment apartment1;
  private Apartment apartment2;
  private Apartment apartment3;
  private Apartment apartment4;
  private int floorNumber;
  private float price;

  public Floor(Apartment apartment1, Apartment apartment2,
               Apartment apartment3, Apartment apartment4,
               int floorNumber, float price) {
    this.apartment1 = apartment1;
    this.apartment2 = apartment2;
    this.apartment3 = apartment3;
    this.apartment4 = apartment4;
    this.floorNumber = floorNumber;
    this.price = price;

    this.apartment1.setPrice(price);
    this.apartment2.setPrice(price);
    this.apartment3.setPrice(price);
    this.apartment4.setPrice(price);
  }

  public Apartment getApartment1() {
    return apartment1;
  }

  public void setApartment1(Apartment apartment1) {
    this.apartment1 = apartment1;
  }

  public Apartment getApartment2() {
    return apartment2;
  }

  public void setApartment2(Apartment apartment2) {
    this.apartment2 = apartment2;
  }

  public Apartment getApartment3() {
    return apartment3;
  }

  public void setApartment3(Apartment apartment3) {
    this.apartment3 = apartment3;
  }

  public Apartment getApartment4() {
    return apartment4;
  }

  public void setApartment4(Apartment apartment4) {
    this.apartment4 = apartment4;
  }

  public int getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public int countAvailableApartments() {
    int count = 0;
    if (!apartment1.isSold()) {
      count++;
    }
    if (!apartment2.isSold()) {
      count++;
    }
    if (!apartment3.isSold()) {
      count++;
    }
    if (!apartment4.isSold()) {
      count++;
    }
    return count;
  }

  public void printDetails() {
    int availableApartments = countAvailableApartments();
    System.out.println("Floor " + floorNumber + " has " + availableApartments + " available apartments");
    apartment1.printDetails();
    apartment2.printDetails();
    apartment3.printDetails();
    apartment4.printDetails();
    if (availableApartments == 0) {
      System.out.println("Has no available apartments");
    }
  }
}
