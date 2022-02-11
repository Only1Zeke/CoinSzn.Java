import java.util.Scanner;
/**
 * A program to decode text message abbreviations.
 */
public class Lab4 {
static void main(String[]args) {
   Scanner input = new Scanner(System.in);

   System.out.println("Input an abbreviation: ");
   String word = input.nextLine();

   if (word.equals("LOL")){
       System.out.println("Laughing out loud");
   }
   else if (word.equals("IMHO")){
       System.out.println("In my humble opinion");
   }
   else{
       System.out.println("Unkown");
   }
 }
}
