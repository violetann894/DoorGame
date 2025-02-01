import java.util.ArrayList;
import java.util.Random;

public class DoorGame {

    private int switchWins;

    private int stayWins;

    private ArrayList<Door> generateDoors(){
        ArrayList<Door> shuffledDoors = new ArrayList<>();

        ArrayList<Door> orderedDoors = new ArrayList<>();
        Door door1 = new Door("Goat");
        Door door2 = new Door("Goat");
        Door door3 = new Door("Car");

        orderedDoors.add(door1);
        orderedDoors.add(door2);
        orderedDoors.add(door3);

        Random random = new Random();

        for(int i = 0; i < 3; i++){

            int randomInt = random.nextInt(0, orderedDoors.size());

            shuffledDoors.add(orderedDoors.remove(randomInt));

        }

        return shuffledDoors;
    }

    public ArrayList<Double> runGame(int trials){

        //Stay trials
        for(int i = 0; i < trials; i++){
            ArrayList<Door> doors = generateDoors();

            Random random = new Random();

            int choice = random.nextInt(0, doors.size());



            if(doors.get(choice).getBehindDoor().equals("Car")){
                stayWins++;
            }
        }

        //Switch trials
        for(int i = 0; i < trials; i++){
            ArrayList<Door> doors = generateDoors();

            Random random = new Random();

            int choice = random.nextInt(0, doors.size());



            if(doors.get(choice).getBehindDoor().equals("Car")){
                switchWins++;
            }
        }

        return calculatePercentages(stayWins, switchWins, trials);
    }

    private ArrayList<Double> calculatePercentages(int stayWins, int switchWins, int numberOfTrials){
        ArrayList<Double> percentages = new ArrayList<>();

        percentages.add((double)stayWins/ (double)numberOfTrials);
        percentages.add((double)switchWins/ (double)numberOfTrials);

        return percentages;
    }
}
