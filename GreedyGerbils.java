import java.util.Scanner;
/**
 * Train your gerbils such that, when sent into a hole, the gerbils return with the most valuable haul.
 *
 * @Zeke Amonoo
 * @2/6/17
 */
public class GreedyGerbils {
  public static void main (String[]args) {
      Scanner input = new Scanner(System.in);
  
      int Metal_Ounces;
      int rhodiumNum = 0;
      int platinumNum = 0;
      int goldNum = 0;
      int ironNum = 0;
      int count = 0;
  

      System.out.println("Input the total ounces for each metal: ");
      // Metal_Ounces = input.nextInt();
    
      System.out.print("Rhodium: ");
      int rhodium = input.nextInt();
      
      System.out.print("Platinum: ");
      int platinum = input.nextInt();
      
      System.out.print("Gold: ");
      int gold = input.nextInt();
      
      System.out.print("Iron: ");
      int iron = input.nextInt();
      
      
      if ((rhodium > 0) && (count < 10)) {
          if(rhodium > 10) {
              rhodiumNum = 10;
              count = 10;
          }
          else {
              rhodiumNum = rhodium;
              count = count + rhodium;
          }
      }
      
      if ((platinum > 0) && (count < 10)) {
          if((count + platinum) < 10) {
              platinumNum = platinum;
              count = count + platinum;
          }
          else {
              int x = (count + platinum) - 10;
              platinumNum = platinum - x;
              count = platinumNum + count;
          }
      }
      
      if ((gold > 0) && (count < 10)) {
          if((count + gold) < 10) {
             goldNum = gold;
              count = count + gold;
          }
          else {
              int x = (count + gold) - 10;
              goldNum = gold - x;
              count = goldNum + count;
          }
      }
      
      if ((iron > 0) && (count < 10)) {
          if((count + iron) < 10) {
              ironNum = iron;
              count = count + iron;
          }
          else {
              int x = (count + iron) - 10;
              ironNum = iron - x;
              count = ironNum + count;
          }
      }
      
      System.out.println("The gerbil will return with " + rhodiumNum + " Rhodium, " + platinumNum + " Platinum, " + goldNum + " Gold, " + ironNum + " Iron");
      
      return;
  }
}
