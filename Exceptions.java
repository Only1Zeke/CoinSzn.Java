import java.util.ArrayList;

/**
 * This class practices polymorphism and exceptions.
 */
public class Lab14
{
    public static void main(String[] args) throws invalidGradYearException
    {
        // Create an ArrayList for Student objects
        ArrayList<Student> list = new ArrayList<Student>();

        // Create some devils and goats and add them to the list
        Devil erin = new Devil(2018, "Erin", 23, Student.SocialYear.SENIOR);
        Goat sarah = new Goat(2020, "Jessica", 22, Student.SocialYear.JUNIOR);
        Devil bert = new Devil(2019, "Bert", 24, Student.SocialYear.SENIOR);

        list.add(erin);
        list.add(sarah);
        list.add(bert);

        // Print out all the students cheering
        for(int i=0; i<list.size(); i++) {
            String c = list.get(i).cheer();
            System.out.println(c);
        }
    }
}
