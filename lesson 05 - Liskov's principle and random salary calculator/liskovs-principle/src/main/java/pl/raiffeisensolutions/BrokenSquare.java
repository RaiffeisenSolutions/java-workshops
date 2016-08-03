package pl.raiffeisensolutions;

public class BrokenSquare extends Rectangle {
    public BrokenSquare(int sideLength) {
        super(sideLength, sideLength);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}
