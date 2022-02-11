import.java.*io;
/**
 * This program has been made to calculate the mileage of a car in either miles or kilometers
 */
public class Project5 {
    public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);

    RunnerInfo runner1 = new RunnerInfo();
    RunnerInfo runner2 = new RunnerInfo();

    runner1.setTime(360);
    runner1.setDist(1.2);

    runner2.setTime(200);
    runner2.setDist(0.5);

    System.out.println("Runner1's speed in MPH: " + runner1.getSpeedMph());
    System.out.println("Runner2's speed in MPH: " + runner2.getSpeedMph());

    return;

    // while (landRoad

        System.out.println("If you would like to calculate MPG type 1, if you would like to calculate km/L type 2? ");
        int unit = a.nextInt(); // This bit of code will store the user's decision of either km or mi

        // System.out.println(unit);

        // This next section will print an individualized message according to the user's previous input

        if (unit == 1) {

            System.out.println("How many miles did you travel? ");
            float distance = a.nextFloat(); // This stores the distance

            System.out.println("How many gallon of gas have you used? ");
            float gas = a.nextFloat(); // This stores the amount of gas used

            float mileage = (distance/gas); // This will calculate the mileage of the car

            System.out.println("Your mileage is "+mileage+" MPG.");

        }
        else if (unit == 2) {

            System.out.println("How many kilometers did you travel? ");
            float distance = a.nextFloat(); // This stores the distance

            System.out.println("How many liters of gas have you used? ");
            float gas = a.nextFloat(); // This stores the amount of gas used

            float mileage = (distance/gas); // This will calculate the mileage of the car

            System.out.println("Your mileage is "+mileage+" km/L.");

        }
        else {

            System.out.println("Please use a valid input.");

        }
    }
}
