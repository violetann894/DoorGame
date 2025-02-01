import java.util.ArrayList;
import java.util.Random;

/**
 * The class DoorGame is responsible for running simulations of the Monty Hall Door problem.
 * @author Rachel Hussmann
 */
public class DoorGame {

    //Initializes the switchWins variable to hold how many wins happen when the choice is switched
    private int switchWins;

    //Initializes the stayWins variable to hold how many wins happen when the choice is kept the same
    private int stayWins;

    /**
     * The generateDoors method creates the ArrayList that hold the combination of three randomly assigned doors.
     * @return This method returns an Arraylist of randomly ordered doors.
     */
    private ArrayList<Door> generateDoors(){

        //Initializes the shuffledDoors arraylist that will be used to hold the randomized list of doors.
        ArrayList<Door> shuffledDoors = new ArrayList<>();

        //Initializes the orderedDoors arraylist that the door objects will be randomly chosen from
        ArrayList<Door> orderedDoors = new ArrayList<>();

        //Initializes the 3 doors used within the game show
        Door door1 = new Door("Goat");
        Door door2 = new Door("Goat");
        Door door3 = new Door("Car");

        //Adds the three doors to the orderedDoor arraylist
        orderedDoors.add(door1);
        orderedDoors.add(door2);
        orderedDoors.add(door3);

        //Initializes a random object
        Random random = new Random();

        //Iterate through the orderedDoors arraylist to randomly pick doors to be added to the shuffledDoors arraylist
        for(int i = 0; i < 3; i++){

            //Generate a random integer from 0 to the size of the arraylist
            int randomInt = random.nextInt(0, orderedDoors.size());

            //Remove the chosen door from the orderedDoors arraylist and add it to the shuffledDoors arraylist
            shuffledDoors.add(orderedDoors.remove(randomInt));
        }

        //Return the shuffledDoor arraylist
        return shuffledDoors;
    }

    /**
     *The runGame method runs the door game, adding up the amount of wins when the door choice is kept the same and then
     * when it is switched.
     * @param trials The number of trials the user would like to run for both trial types.
     * @return This method returns an ArrayList of doubles associated with the percentages of wins for both types of trials.
     */
    public ArrayList<Double> runGame(int trials){

        //Stay trials
        for(int i = 0; i < trials; i++){

            //Generate the new list of doors
            ArrayList<Door> doors = generateDoors();

            //Create a random object to use for picking random integers
            Random random = new Random();

            //Remove the door choice to make it easier to look through the remaining doors
            Door choice = doors.remove(random.nextInt(0, doors.size()));

            //If the selected door is not the car door
            if(!choice.getBehindDoor().equals("Car")){

                //then it means it is still an option and cannot be revealed

                //Iterate through the list to find the one goat door
                for(int j = 0; j < doors.size(); j++){

                    //If the loop found the goat door
                    if(doors.get(j).getBehindDoor().equals("Goat")){

                        //Reveal that door as a goat and remove it from the list
                        Door revealed = doors.remove(j);
                    }
                }

                //else the selected door is the car
            }else{

                //Randomly pick one of the goat doors to reveal
                int removeDoor = random.nextInt(0, doors.size());

                //Reveal that door as a goat and remove it from the list
                Door revealed = doors.remove(removeDoor);
            }

            //Since this for loop is the stay trials, the choice door stays the same

            //Check if the chosen door is the car door
            if(choice.getBehindDoor().equals("Car")){

                //if it is

                //Add one win to the stayWins variable
                stayWins++;
            }
        }

        //Switch trials
        for(int i = 0; i < trials; i++){

            //Generate the new list of doors
            ArrayList<Door> doors = generateDoors();

            //Create a random object to use for picking random integers
            Random random = new Random();

            //Remove the door choice to make it easier to look through the remaining doors
            Door choice = doors.remove(random.nextInt(0, doors.size()));

            //If the selected door is not the car door
            if(!choice.getBehindDoor().equals("Car")){

                //then it means it is still an option and cannot be revealed

                //Iterate through the list to find the one goat door
                for(int j = 0; j < doors.size(); j++){

                    //If the loop found the goat door
                    if(doors.get(j).getBehindDoor().equals("Goat")){

                        //Reveal that door as a goat and remove it from the list
                        Door revealed = doors.remove(j);
                    }
                }

                //else the selected door is the car
            }else{

                //Randomly pick one of the goat doors to reveal
                int removeDoor = random.nextInt(0, doors.size());

                //Reveal that door as a goat and remove it from the list
                Door revealed = doors.remove(removeDoor);
            }

            //Since this for loop is the switch trials, the choice door needs to change

            //The last door is the only option left in the list, so we can call doors.get(0) to get that door
            choice = doors.get(0);

            //Check if the chosen door is the car door
            if(choice.getBehindDoor().equals("Car")){

                //if it is

                //Add one win to the switchWins variable
                switchWins++;
            }
        }

        /* After all the trials are over, call the calculatePercentages() method to calculate the percentages for the
           trials */
        return calculatePercentages(stayWins, switchWins, trials);
    }

    /**
     *The calculatePercentages method accepts the number of wins from both types of trials and the number of trials to
     * calculate the percentage of wins.
     * @param stayWins The number of wins when the trial kept its choice the same.
     * @param switchWins The number of wins when the trial switched its choice.
     * @param numberOfTrials The number of times the trials ran for each type.
     * @return This method returns an ArrayList of doubles that contains the percentages of wins for both trial types.
     */
    private ArrayList<Double> calculatePercentages(int stayWins, int switchWins, int numberOfTrials){

        //Initialize the arraylist that will hold the value of percentages
        ArrayList<Double> percentages = new ArrayList<>();

        //The first double is the percentage of stayWins
        percentages.add((double)stayWins/ (double)numberOfTrials);

        //The second double is the percentage of switchWins
        percentages.add((double)switchWins/ (double)numberOfTrials);

        //Return the arraylist
        return percentages;
    }
}
