
/**
 * Printing input and output variable types.
 *
 * @Zedekiah Amonoo
 *
 */
import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Enter a double: ");
        double multiple = input.nextDouble();

        System.out.println("Enter a character: ");
        char letter = input.next().charAt(0);
        // Character.isAlphabetic((char)letter);

        System.out.println("Enter a string: ");
        String word = input.next();

        System.out.println(number + " " + multiple + " " + letter + " " + word);
        System.out.println(word + " " + letter + " " + multiple + " " + number);
        System.out.println(multiple + " as an integer is " + (int) multiple);

    }
}
