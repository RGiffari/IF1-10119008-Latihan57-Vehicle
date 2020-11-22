package latihan.Vehicle;

public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle() {
        System.out.println("Bicyscle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}