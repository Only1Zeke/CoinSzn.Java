/*
*The next number is the sum of the following 2 numbers
*
*Zedekiah Amonoo
*
*/
import java.util.Scanner;

public class Fibonacci_Series{
    public static void main(String[] args) {

    System.out.println("Welcome to Fibonacci practice");

    //lists usable variables
    int num1 = 0, num2 = 0, num3, i, count = 10;

    System.out.print(num1+""+num2);

    //Loop begins at 2 since 0 and 1 are printed first
    for (i = 2,i < count, ++i){
    num3 = num1 + num2;

    System.out.print(""+num3);
    num1 = num2;
    num2 = num3;
    }
  }
}
