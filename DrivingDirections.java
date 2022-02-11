
/**
 * A program that reads in a text file containing the step-by-step driving directions from one place to another, and prints the reverse directions
 * @Zeke Amonoo
 * @Project 3 Directions To & Fromm
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Directions {
    
    public static final ArrayList<String> directions = new ArrayList<>();
    public static double total = 0;
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the text file: ");
        String filename = input.next();
        System.out.println("What is the price per gallon of gas? ");
        double ppg = input.nextDouble();
        System.out.println("What is your vehicle's fuel efficieny in MPG: ");
        double mpg = input.nextDouble();
        
  
        File file = new File(filename);
        Scanner fileInput = new Scanner(file);
        Scanner mileCalc = new Scanner(file);
        while (fileInput.hasNextLine()) {
            directions.add(fileInput.nextLine());
        }
        
        
        for (int i = 0; i < directions.size(); i++) {
            if (directions.get(i).contains("Right")) {
                directions.set(i, directions.get(i).replace("Right", "R"));
            }
            if (directions.get(i).contains("Left")) {
                directions.set(i, directions.get(i).replace("Left", "L"));
            }
        }
        /*
        Gets rid of whole numbers and the direction
        */
        String instruct = "";
        instruct = directions.get(0);
        instruct = instruct.replaceAll("[^0-9\\.]+", "");
        double instructionNum = Double.parseDouble(instruct);
        directions.remove(directions.get(0));
       
        Collections.reverse(directions);
       
        int grab = directions.get(0).indexOf("is");
        String grabbed = directions.get(0).substring(0, grab);
        directions.remove(directions.get(0));
        directions.add(0, "Start at " + grabbed);
        
        for(int i = 0; i < directions.size(); i++){
            if (directions.get(i).contains("R")) {
                directions.set(i, directions.get(i).replace("R", "L"));
            }
            else if(directions.get(i).contains("L")){
                directions.set(i, directions.get(i).replace("L", "R"));
            }
        }
        
        
        String[] finalWord = directions.get(directions.size()-1).split("at ");
        String lastWord = finalWord[finalWord.length -1];
        directions.remove(directions.size()-1);
        
        for (int i = directions.size()-2; i < directions.size();i++) {
            if (directions.get(i).contains("R")) {
                directions.set(i, directions.get(i).replace("R", "L"));
            }
            else if (directions.get(i).contains("L")) {
                directions.set(i, directions.get(i).replace("L", "R"));
            }
        }
        if (directions.get(directions.size()-1).startsWith("L")) {
            directions.add(lastWord + " is on the R");
        }
        if (directions.get(directions.size()-1).startsWith("R")) {
            directions.add(lastWord + " is on the L");
        }
        
        
        double mile;
        while (mileCalc.hasNext()) {
            String mileNum = mileCalc.next();
            mileNum = mileNum.replaceAll("[^0-9\\.]+", "");
            
            if (!mileNum.equals("")) {
            mileNum = mileNum.replaceAll("[()]", "");
            mile = Double.parseDouble(mileNum);
            total += mile;
            
            }
        }
        
        total -= instructionNum;
        total *=2;
        String fixTotal = String.format("%.1f",total);
        
        for (int i = 0; i < directions.size(); i++) {
            System.out.println(directions.get(i));
        }
        System.out.println("Your " + fixTotal + "-mile round trip will cost about $" + findCost(ppg,mpg,total));
    }
    public static String findCost (double price, double mpg, double miles){
        double cost = miles / mpg;
        cost *= price;
        String costs = String.format("%.2f", cost);
        return costs;
    }
}
