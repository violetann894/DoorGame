
public class Door {

    private String behindDoor;

    public Door(){
        this.behindDoor = "G";
    }

    public Door(String behindDoor){
        this.behindDoor = behindDoor;
    }

    public String getBehindDoor(){
        return behindDoor;
    }

    public void setBehindDoor(String behindDoor){
        this.behindDoor = behindDoor;
    }

}
