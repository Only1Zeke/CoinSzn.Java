import java.util.Scanner;
/**
 * A program to compare words
 */
public class Lab6 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter the first word: ");
            String word1 = input.next();

            System.out.println("Enter the second word: ");
            String word2 = input.next();

            System.out.println("Enter the third word: ");
            String word3 = input.next();


            if (word1.compareTo(word2) > 0) {

                if (word2.compareTo(word3) > 0) {
                   System.out.println(word3 + " " + word2 + " " + word1);
                }
                else if (word2.compareTo(word3) < 0) {
                   System.out.println(word2 + " " + word3 + " " + word1);
                }
            }
            else if (word1.compareTo(word2) < 0) {

                if (word2.compareTo(word3) < 0) {
                   System.out.println(word1 + " " + word2 + " " + word3);
                }
                else if (word2.compareTo(word3) > 0) {
                   System.out.println(word1 + " " + word3 + " " + word2);
                }
            }




    }
}
