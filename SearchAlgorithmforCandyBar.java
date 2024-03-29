import java.util.ArrayList;

/**
 * This lab practices writing and using search algorithms.
 */
public class Lab16
{
    public static void main(String[] args)
    {
        ArrayList<CandyBar> bars = new ArrayList<CandyBar>();
        addCandyBarsToList(bars);

        /**
         * Use the methods you wrote below to answer all of
         * the following questions.
         */

        /**
         * Part A:
         */

        /**
         * Is Twix in the list?
         * If so, print all information about it.
         * If not, print a message to the user.
         */

        /**
         * Is Mounds in the list?
         * If so, print all information about it.
         * If not, print a message to the user.
         */


        /**
         * Part B:
         */

        /**
         * Print all the names of candy bars with yellow wrappers.
         */


        /**
         * Part C:
         */

        /**
         * Count how many candy bars are 1.75 oz or more.
         */


        /**
         * Part D:
         */

        /**
         * Is there a candy bar that is 1.86 oz?
         * If so, print the information.
         * If not, print a message to the user.
         * Write a binary search method to get the answer.
         */


    }

    /**
     * This method searches a list to find a candy bar by name.
     *
     * @param	list	the list to search
     * @param	n    	a name to find
     * @return			the index of the candy bar
     */
    public static int findCandyBar(ArrayList<CandyBar> list, String n)
    {
        return -1;
    }

    /**
     * This method prints the names of the candy bars that have a certain
     * wrapper color.
     *
     * @param	list	the list to search
     * @param	c    	the color wrapper to find
     */
    public static void findByColor(ArrayList<CandyBar> list, CandyBar.Color c)
    {

    }

    /**
     * This method counts the number of candy bars that weigh greater than
     * or equal to the weight input parameter.
     *
     * @param	list	the list to search
     * @param	w    	the weight to compare to
     * @return			the count of candy bars
     */
    public static int countByWeight(ArrayList<CandyBar> list, double weight)
    {
        return 0;
    }

    /**
     * This method searches a list using binary search.
     *
     * @param	list	the list to search
     * @param	first   the first index
     * @param	last	the last index
     * @param	w		the value to search for
     * @return			the index of the candy bar
     */
    public static int binaryFind(ArrayList<CandyBar> list, int first, int last, double w)
    {
        return -1;
    }

    /**
     * This method adds candy bars to a list.
     *
     * @param	list	the list to add to
     */
    public static void addCandyBarsToList(ArrayList<CandyBar> list)
    {
        CandyBar kitkat = new CandyBar("KitKat", CandyBar.Color.RED, 1.5);
        list.add(kitkat);
        CandyBar grand = new CandyBar("One-hundred Grand", CandyBar.Color.RED, 1.5);
        list.add(grand);
        CandyBar crunch = new CandyBar("Crunch", CandyBar.Color.BLUE, 1.55);
        list.add(crunch);
        CandyBar hershey = new CandyBar("Hershey", CandyBar.Color.BROWN, 1.55);
        list.add(hershey);
        CandyBar krackel = new CandyBar("Krackel", CandyBar.Color.RED, 1.55);
        list.add(krackel);
        CandyBar caramello = new CandyBar("Caramello", CandyBar.Color.PURPLE, 1.6);
        list.add(caramello);
        CandyBar what = new CandyBar("Whatchamacallit", CandyBar.Color.YELLOW, 1.6);
        list.add(what);
        CandyBar almond = new CandyBar("Almond Joy", CandyBar.Color.BLUE, 1.61);
        list.add(almond);
        CandyBar goodbar = new CandyBar("Mr. Goodbar", CandyBar.Color.YELLOW, 1.75);
        list.add(goodbar);
        CandyBar twix = new CandyBar("Twix", CandyBar.Color.GOLD, 1.79);
        list.add(twix);
        CandyBar henry = new CandyBar("Oh Henry", CandyBar.Color.YELLOW, 1.8);
        list.add(henry);
        CandyBar milkyWay = new CandyBar("Milky Way", CandyBar.Color.GREEN, 1.84);
        list.add(milkyWay);
        CandyBar payDay = new CandyBar("PayDay", CandyBar.Color.ORANGE, 1.85);
        list.add(payDay);
        CandyBar snickers = new CandyBar("Snickers", CandyBar.Color.BLUE, 1.86);
        list.add(snickers);
        CandyBar butterfinger = new CandyBar("Butterfinger", CandyBar.Color.YELLOW, 1.9);
        list.add(butterfinger);
        CandyBar musketeers = new CandyBar("Three Musketeers", CandyBar.Color.SILVER, 1.92);
        list.add(musketeers);
        CandyBar reeses = new CandyBar("Reese's FastBreak", CandyBar.Color.ORANGE, 2);
        list.add(reeses);
        CandyBar babyRuth = new CandyBar("Baby Ruth", CandyBar.Color.SILVER, 2.1);
        list.add(babyRuth);
    }
}
