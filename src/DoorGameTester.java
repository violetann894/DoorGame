import java.util.ArrayList;

public class DoorGameTester {

    public static void main(String[] args) {

        DoorGame tester = new DoorGame();
        ArrayList<Double> results = tester.runGame(10000);
        System.out.println("Percentage of wins when choice was the same: " + results.get(0) + "%");
        System.out.println("Percentage of wins when choice switched: " + results.get(1) + "%");

    }

}