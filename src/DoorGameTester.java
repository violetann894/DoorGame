import java.util.ArrayList;

/**
 * The DoorGameTester class is used to run the door game and figure out the percentages associated with switching door
 * choice or keeping it the same.
 * @author Rachel Hussmann
 */
public class DoorGameTester {

    public static void main(String[] args) {

        //Initializes the DoorGame tester object
        DoorGame tester = new DoorGame();

        //Initializes the results ArrayList to hold the calculated percentages of the trials
        ArrayList<Double> results = tester.runGame(10000);

        //Print statements to print out the results of the trials
        System.out.printf("Percentage of wins when choice was the same: %.2f \n", results.get(0)*100);
        System.out.printf("Percentage of wins when choice switched: %.2f \n", results.get(1)*100);

    }

}