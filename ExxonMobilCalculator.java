import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Project3 {
    
    public static final ArrayList<String> directions = new ArrayList<>();
    public static double total = 0;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the file name: ");
        String filename = input.next();
        System.out.println("Enter the price per gallon of gas: ");
        double ppg = input.nextDouble();2
        System.out.println("Enter the vehicle's MPG: ");
        double mpg = input.nextDouble();
        /*
        Reads in files
        */
        File file = new File(filename);
        Scanner fileInput = new Scanner(file);
        Scanner mileCalc = new Scanner(file);
        while (fileInput.hasNextLine()) {
            directions.add(fileInput.nextLine());
        }
        /*
        Shortens the direction to one letter
        */
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
        /*
        Reverses the order of the directions
        */
        Collections.reverse(directions);
        /*
        Takes the first location and puts it in the back
        */
        int grab = directions.get(0).indexOf("is");
        String grabbed = directions.get(0).substring(0, grab);
        directions.remove(directions.get(0));
        directions.add(0, "Start at " + grabbed);
        /*
        Changes all Rs to Ls and Ls to Rs
        */
        for(int i = 0; i < directions.size(); i++){
            if(directions.get(i).contains("R")){
                directions.set(i, directions.get(i).replace("R", "L"));
            }else if(directions.get(i).contains("L")){
                directions.set(i, directions.get(i).replace("L", "R"));
            }
        }
        /*
        Takes the last location and places it in the beginning
        */
        String[] lW = directions.get(directions.size()-1).split("at ");
        String lastWord = lW[lW.length -1];
        directions.remove(directions.size()-1);
        for(int i = directions.size()-2; i < directions.size();i++){
            if(directions.get(i).contains("R")){
                directions.set(i, directions.get(i).replace("R", "L"));
            }else if(directions.get(i).contains("L")){
                directions.set(i, directions.get(i).replace("L", "R"));
            }
        }
        if(directions.get(directions.size()-1).startsWith("L")){
            directions.add(lastWord + " is on the R");
        }
        if(directions.get(directions.size()-1).startsWith("R")){
            directions.add(lastWord + " is on the L");
        }
        /*
        Grabs all of the miles traveled and adds them up and prints out the trip cost
        */
        double mile;
        while(mileCalc.hasNext()){
            String mileNum = mileCalc.next();
            mileNum = mileNum.replaceAll("[^0-9\\.]+", "");
            if(!mileNum.equals("")){
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
    /*
    Finds the cost of the trip
    */
    public static String findCost (double price, double mpg, double miles){
        double cost = miles / mpg;
        cost *= price;
        String costs = String.format("%.2f", cost);
        return costs;
    }
}
