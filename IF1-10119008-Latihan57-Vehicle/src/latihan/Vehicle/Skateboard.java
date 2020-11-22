package latihan.Vehicle;

public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard() {
        System.out.println("SkateBoard");
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

}