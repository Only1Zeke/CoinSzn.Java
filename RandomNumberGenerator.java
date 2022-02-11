import java.util.Random;
import java.util.Scanner;
/**
 * Write a "push your luck" program where a user can continually get a random number between 1 and 11 until she decides to quit or the numbers' sum exceeds 21.
 */
public class Lab7 {
    public static void main (String[]args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();

        int randomNum;
        int finalSum = 0;
        boolean loopLuck = true;

        System.out.println("Push your luck!");
        while(loopLuck == true) {
            System.out.println("Enter a letter");
            String letter = scnr.next();

            if (!letter.equals("q")) {
                randomNum = randGen.nextInt(11) + 1;
                finalSum += randomNum;
                System.out.println("Random Number: " + randomNum);
                System.out.println("Updated sum: " + finalSum);
            }

            if (letter.equals("q")) {
                loopLuck = false;
                System.out.println("Thanks for playing!");
                System.out.println("\nFinal Sum: " + finalSum);
            }

            if (finalSum == 19) {
                System.out.println("\nSo close!");
            }

            if (finalSum > 21) {
                loopLuck = false;
                System.out.println("\nYou bust!");
                System.out.println("Thanks for playing!");
                System.out.println("\nFinal Sum: " + finalSum);
            }

            if (finalSum == 21) {
                loopLuck = false;
                System.out.println("\nYou win!");
                System.out.println("Thanks for playing!");
                System.out.println("\nFinal Sum: " + finalSum);
            }
        }
    }
}
