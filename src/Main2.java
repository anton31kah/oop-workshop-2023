public class Main2 {
  public static void main(String[] args) {
    Apartment apartment1 = new Apartment(false, 1, 50);
    Apartment apartment2 = new Apartment(true, 2, 80);
    Apartment apartment3 = new Apartment(true, 3, 120);
    Apartment apartment4 = new Apartment(false, 4, 50);

    Floor floor1 = new Floor(apartment1, apartment2, apartment3, apartment4, 1, 1200);

    Apartment apartment5 = new Apartment(true, 5, 100);
    Apartment apartment6 = new Apartment(true, 6, 130);
    Apartment apartment7 = new Apartment(true, 7, 60);
    Apartment apartment8 = new Apartment(true, 8, 40);

    Floor floor2 = new Floor(apartment5, apartment6, apartment7, apartment8, 2, 1300);

    Apartment apartment9 = new Apartment(true, 9, 120);
    Apartment apartment10 = new Apartment(false, 10, 50);
    Apartment apartment11 = new Apartment(false, 11, 75);
    Apartment apartment12 = new Apartment(false, 12, 180);

    Floor floor3 = new Floor(apartment9, apartment10, apartment11, apartment12, 3, 1400);

    Building building = new Building("Makedonija", floor1, floor2, floor3);

    building.printDetails();
  }
}
