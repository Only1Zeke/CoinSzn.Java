import java.util.Scanner;

/**
 * A program that reads a number and converts the given temperature from Fahrenheit to Celsius..
 */

public class Lab2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double TempF;
        double TempC;

        System.out.println("Enter a temperature in Fahrenheit: "); 
        TempF = input.nextDouble();

        System.out.println(TempF);

        TempC = ((TempF-32)*(5.0/9.0));
        System.out.println(TempC + " Celsius");


    }
}
