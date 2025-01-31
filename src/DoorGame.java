import java.util.ArrayList;
import java.util.Random;

public class DoorGame {

    //Need to randomize list for each experiment
    //make sure to code in that it only shows a bad prize when revealing a door

    private ArrayList<Double> percentages;

    private int countOfWinsSwitch;

    private int countOfWinsStay;

    private ArrayList<Door> doors;

    public DoorGame(){
        doors = generateDoors();
    }

    private ArrayList<Door> generateDoors(){
        ArrayList<Door> shuffledDoors = new ArrayList<>();

        ArrayList<Door> orderedDoors = new ArrayList<>();
        Door door1 = new Door("Goat 1");
        Door door2 = new Door("Goat 2");
        Door door3 = new Door("Car");

        orderedDoors.add(door1);
        orderedDoors.add(door2);
        orderedDoors.add(door3);

        Random random = new Random();

        for(int i = 0; i < 3; i++){

            int randomInt = random.nextInt(0, orderedDoors.size());

            shuffledDoors.add(orderedDoors.remove(randomInt));

        }

        return doors;
    }

    public ArrayList<Double> runGame(){

        return ;
    }

    private ArrayList<Double> calculatePercentages(int stayWins, int switchWins){


        return percentages;
    }
}
