import java.util.ArrayList;
import java.util.List;

public class Student {
  private int rating;
  private String name;
  static Student s1, s2, s3;
  static double averageRating;

  // TODO implement Student class according to the instructions provided in the README.md file

  public Student(String name) {
    //TODO initialize name
    this.name = name;
  }

  public Student() {

  }

  public static double getAvgRating() {
    // TODO return average rating of all students
    return averageRating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    // TODO set student's name
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    // TODO initialize rating;
    this.rating = rating;
  }

  public boolean betterStudent(Student student) {
    // TODO return the result of comparing this.student's rating with the student's rating
    return rating >= student.getRating();
  }

  public void changeRating(int rating) {
    this.rating = rating;
    int sumRating = s1.getRating() + s2.getRating() + s3.getRating();
    averageRating = ((double)sumRating)/3;
    // TODO change this student's rating and average rating of all students
  }

  public static void removeStudent(Student student) {
    // TODO remove student
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
    return name+rating;
  }

  public static void main (String[] args) {
    s1 = new Student();
    s2 = new Student();
    s3 = new Student();

    s1.setName("Iryna");
    s2.setName("Olena");
    s3.setName("Vitaliy");

    s1.setRating(10);
    s2.setRating(20);
    s3.setRating(12);

    int sumRating = s1.getRating() + s2.getRating() + s3.getRating();
    averageRating = ((double)sumRating)/3;

    System.out.println(getAvgRating());

    if (s1.betterStudent(s2)) {
      System.out.println(s1.getName() + " is the better student than " + s2.getName());
    } else {
      System.out.println(s2.getName() + " is the better student than " + s1.getName());
    }

    s1.changeRating(22);

    System.out.println(getAvgRating());

    if (s1.betterStudent(s2)) {
      System.out.println(s1.getName() + " is the better student than " + s2.getName());
    } else {
      System.out.println(s2.getName() + " is the better student than " + s1.getName());
    }
  }
}
