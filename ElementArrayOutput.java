import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter; 
/**
 * Reads in all lines from a file and saves each to an element in an array. The program should then print out the lines in reverse.
 *
 * @Zeke Amonoo
 * @2/20/17
 */
public class Lab8 {
    public static void main(String[]args) throws IOException{
        FileInputStream fileIn = new FileInputStream("haikuFun.txt");
        Scanner scnr = new Scanner(fileIn);
        
        String [] poem = new String[6];
        poem[0] = scnr.nextLine();
        poem[1] = scnr.nextLine();
        poem[2] = scnr.nextLine();
        poem[3] = scnr.nextLine();
        poem[4] = scnr.nextLine();
        poem[5] = scnr.nextLine();
        
        fileIn.close();
        
        int reverse = 0;
        FileWriter fileWriter = new FileWriter("reverse.txt");
       // FileOutputStream fileOut = new FileOutputStream("reverse.txt");
        BufferedWriter out = new BufferedWriter(fileWriter);
       // out.newLine();
        out.write(poem[5]);
        out.newLine();
        out.write(poem[4]);
        out.newLine();
        out.write(poem[3]);
        out.newLine();
        out.write(poem[2]);
        out.newLine();
        out.write(poem[1]);
        out.newLine();
        out.write(poem[0]);
        out.close();
    }
}