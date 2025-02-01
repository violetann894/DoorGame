/**
 * The Door class is responsible for holding information about a door being used in a DoorGame.
 * @author Rachel Hussmann
 */
public class Door {

    //Initializes the string that states what is behind the door
    private String behindDoor;

    /**
     * Constructor for the Door class.
     * @param behindDoor The String value of what is behind the door.
     */
    public Door(String behindDoor){
        this.behindDoor = behindDoor;
    }

    /**
     * The getBehindDoor method returns the string that states what is behind the door
     * @return This method returns the string of what is behind the door
     */
    public String getBehindDoor(){
        return behindDoor;
    }

    /**
     * The setBehindDoor method accepts a new string that changes what is behind the door.
     * @param behindDoor The new String value of what is behind the door.
     */
    public void setBehindDoor(String behindDoor){
        this.behindDoor = behindDoor;
    }
}
