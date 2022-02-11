
/**
 * A main function to test your Student class. To show that your Student class works.
 */
public class Lab12 {
   public static void main (String[]args) {
    // instance variables - replace the example below with your own

    //1) Create more than one Student object
    Student.SocialYear x;
    x = Student.SocialYear.SOPHMORE;

    Student student1 = new Student("Pablo", 18, x);
    student1.setAge();
    student1.getAge();

    x = x.SENIOR;
    Student student2 = new Student("Bryce", 12, x);
    student2.setAge();
    student2.getAge();

    //2) Call getName at least once
    System.out.println(student1.getName());
    //3) Call getAge at least once
    System.out.println(student1.getAge());
    //4) Call setAge at least once and then call getAge to make sure it worked
    student1.setAge();
    System.out.println(student1.getAge());
    //5) Call getSocialYear at least once
    System.out.println(student1.getSocialYear());
    //6) Call canVote on a student that can vote
    System.out.println(student1.canVote());
    //7) Call canVote on a student that can not vote
    System.out.println(student2.canVote());
    //8) Call addFriend a few times
    student2.addFriend("Zeke");
    student2.addFriend("Clarence");
    student2.addFriend("Jenissi");
    student2.addFriend("Steph");
    //9) Call hasFriend in a way that should return true at least once
    System.out.println(student2.hasFriend("Jordan"));
    //10) Call hasFriend in a way that should return false at least once
    System.out.println(student2.hasFriend("Joeleen"));

    }
}
