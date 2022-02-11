
import java.util.Scanner;


public class Project5 {
   
      
	   public static double calculateGpa(int[] credits, String[] grades) {
	      // type your code to convert all of your credits and grades to the final GPA
	      // somewhere in this code you will call convertToQualityPoints for each class
		  // probably in a loop
                  double totalGrade= 0.0;
                  int totalCreds=0;
                  
                  int x =0;
                  while(x<credits.length)
                  {
                      totalGrade =totalGrade + convertToQualityPoints(credits[x],grades[x]);
                      totalCreds = totalCreds+ credits[x];
                      
                      x++;
                  }
		   
		   
	      return totalGrade/totalCreds;
	   }
	   
	   public static double convertToQualityPoints(int cr, String gr) {
	      // this is the code that converts an "A" to 4.0 and then multiplies it by the number of credits
	      // so a 3 credit "A" returns 12.0, a 2 credit C+ returns 4.6
               double points =0.0;
		  // no loop in this method
                  if (gr.equals("A")) {
			points = 4.0;
		} else if (gr.equals("A-")) {
			points = 3.7;
		} else if (gr.equals("B+")) {
			points = 3.3;
		} else if (gr.equals("B")) {
			points = 3.0;
		} else if (gr.equals("B-")) {
			points = 2.7;
		} else if (gr.equals("C+")) {
			points = 2.3;
		} else if (gr.equals("C")) {
			points = 2.0;
		} else if (gr.equals("C-")) {
			points = 1.7;
		} else if (gr.equals("D+")) {
			points = 1.3;
		} else if (gr.equals("D")) {
			points = 1.0;
		} else if (gr.equals("F")) {
			points = 0.0;
		}
                  
                  
	      
	      return points*cr;
	   }
	   
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
                String[] grades = new String[5];
                int[] credits = new int[5];
                
		

		//double gpa = 0.0;

		// Prompts and stuff

		// Class 1
                int x=0;
                while(x<5)
                {
                   
                    System.out.println("How many credits was class "+(x+1)+"?");
                    credits[x]=scnr.nextInt();
                    scnr.nextLine();
                    System.out.println("What grade did you get?");
                    grades[x]=scnr.nextLine();
                     x++;
                    
                    
                    
                    
                }
                //int credits2[] = {2,3};
                //String grades2[] = {"A","F"};
	     double gpa =calculateGpa(credits,grades);
		
		// closing statements and things that determine if you made a list or not.
                
		//totalcredits = (credit1 + credit2 + credit3 + credit4 + credit5);
		//gpa = (qualPoints1 + qualPoints2 + qualPoints3 + qualPoints4 + qualPoints5) / totalcredits;

		System.out.printf("Your GPA is %.2f%n", gpa);

		if (gpa == 4.0) {
			System.out.println("You made the President's list!");
		} else if (gpa >= 3.5) {
			System.out.println("You made the Dean's list!");
		} else if (gpa <= 2.0) {
			System.out.println("You will be placed on academic probation. :'(");

		}
	}
}

