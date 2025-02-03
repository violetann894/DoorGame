import java.util.ArrayList;

/**
 * The DoorGameTester class is used to run the door game and figure out the percentages associated with switching door
 * choice or keeping it the same. It also holds the answers to questions a and b from the textbook
 * @author Rachel Hussmann
 */
public class DoorGameTester {

    /* Question 2.20 a) There are three simple events associated with this problem. E1 = Contestant chooses a good door,
    E2 = Contestant chooses bad door 1, E3 = Contestant chooses bad door 2. Each event has an equal probability of 1/3.
    The probability that the contestant chooses the nice prize is 1/3 since there is only one event where that happens.
    P(A) = P(E1) = 1/3
    */

    /* Question 2.20 b)
        i. If she chooses to stay with her initial choice, the probability that she wins the good prize is 1/3.
        P(A) = P(E1) = 1/3.
        ii. If the host shows her a dud, and she switches her choice away from the good prize, then she has chosen the
        other dud.
        iii. If the host shows her a dud, and she switches her choice away from the other dud, then she has chosen the
        good prize.
        iv. If the contestant switches her choice when shown the other dud, her chances of winning go up. The only way
        that she can win using this strategy is if she chooses a dud in her first pick. The chance of choosing a dud
        is 2/3. P(A) = P(E2) + P(E3) = 2/3. If she picks a dud on the first pick, then the game show host will only
        show her the other dud. So by always switching her choice, she has a 2/3 chance of winning, rather than a 1/3
        chance by staying and hoping she picked the good prize on the first try.
        v. The strategy that maximizes the contestant's probability of winning the good prize is by switching her
        choice to the other curtain/door.
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