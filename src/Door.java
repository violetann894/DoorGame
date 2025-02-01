
public class Door {

    private String behindDoor;

    private String nameOfDoor;

    public Door(String behindDoor, String nameOfDoor){
        this.behindDoor = behindDoor;

        this.nameOfDoor = nameOfDoor;
    }

    public String getBehindDoor(){
        return behindDoor;
    }

    public void setBehindDoor(String behindDoor){
        this.behindDoor = behindDoor;
    }

    public String getNameOfDoor() {
        return nameOfDoor;
    }

    public void setNameOfDoor(String nameOfDoor) {
        this.nameOfDoor = nameOfDoor;
    }

}
