import java.util.ArrayList;

/**
 * The DoorGameTester class is used to run the door game and figure out the percentages associated with switching door
 * choice or keeping it the same. It also holds the answers to questions a and b from the textbook
 * @author Rachel Hussmann
 */
public class DoorGameTester {

    /* Question 2.20 a) There are three simple events associated with this problem. E1 = Contestant chooses a good door,
    E2 = Contestant chooses bad door 1, E3 = Contestant chooses bad door 2 Each event has an equal probability of 1/3.
    The probability that the contestant chooses the nice prize is 1/3 since there is only one event where that happens.
    P(A) = P(E1) = 1/3
    */

    /* Question 2.20 b)
    */
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