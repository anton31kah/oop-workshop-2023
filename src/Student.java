public class Student {
  private String name;
  private String lastname;
  private int grade;
  private int index;
  private int age;
  private float gpa;

  public Student(String name, String lastname, int grade, int index, int age, float gpa) {
    this.name = name;
    this.lastname = lastname;
    this.grade = grade;
    this.index = index;
    this.age = age;
    this.gpa = gpa;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public int getGrade() {
    return grade;
  }

  public int getIndex() {
    return index;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGpa(float gpa) {
    this.gpa = gpa;
  }

  public float getGpa() {
    return gpa;
  }

  public boolean hasStraightA() {
    return gpa == 10;
  }

  public void printDetails() {
    System.out.println(name + " " + lastname + " " + index + " " + grade + " " + age + " " + gpa);
    if (hasStraightA()) {
      System.out.println("Odlicen");
    } else {
      System.out.println("Dobar");
    }
  }

}
