public class Student {
  private int rating;
  private String name;
  static double totalRating;
  static int count;

  public Student(String name) {
    this.name = name;
    count++;
  }

  public Student() {
    count++;
  }

  public static double getAvgRating() {
    if (count == 0)
      return 0;

    return totalRating/count;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    totalRating += rating;
  }

  public boolean betterStudent(Student student) {
    return rating >= student.getRating();
  }

  public void changeRating(int rating) {
    totalRating -= this.rating;
    this.rating = rating;
    totalRating += rating;
  }

  public static void removeStudent(Student student) {
    count--;
    totalRating-=student.getRating();
  }

  @Override
  public String toString() {
    return name+rating;
  }

  public static void main (String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

    s1.setName("Iryna");
    s2.setName("Olena");
    s3.setName("Vitaliy");

    s1.setRating(10);
    s2.setRating(20);
    s3.setRating(12);

    System.out.println("Average rating is: "+ getAvgRating());

    if (s1.betterStudent(s2)) {
      System.out.println(s1.getName() + " is the better student than " + s2.getName());
    } else {
      System.out.println(s2.getName() + " is the better student than " + s1.getName());
    }

    s1.changeRating(22);

    System.out.println("Average rating is: "+ getAvgRating());

    if (s1.betterStudent(s2)) {
      System.out.println(s1.getName() + " is the better student than " + s2.getName());
    } else {
      System.out.println(s2.getName() + " is the better student than " + s1.getName());
    }
  }
}
