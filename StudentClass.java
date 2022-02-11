import java.util.*;
/**
 *
 *Class represents a person that has a name, an age, a social year, and friends. Use an ArrayList of Strings to represent a list of friends.
 */
// public static void main (String[]args) {
public class Student {
   public enum SocialYear {FRESHMAN, SOPHMORE, JUNIOR, SENIOR}

   // instance variables - replace the example below with your own

    private String name;
    private ArrayList<String> friends = new ArrayList<String>();
    private int age;
    private SocialYear year;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int age, SocialYear year) {
        // initialise instance variables
        this.name = name;
        this.age = age;
        this.year = year;
   }
    public String getName() {
        return this.name;
   }
    public int getAge() {
        return this.age;
   }
    public void setAge() {
        this.age = age + 1;
   }
    public SocialYear getSocialYear() {
        return this.year;
   }
    public boolean canVote() {
        if (age >= 18) {
        return true;
        }
        else {
        return false;
        }
   }
    public void addFriend(String friend) {
        friends.add(friend);
   }
    public boolean hasFriend(String friend) {
       for (int i = 0; i < friends.size(); i++) {
           if (friends.get(i)==friend) {
               return true;
            }
       }
       return false;
   }
}
