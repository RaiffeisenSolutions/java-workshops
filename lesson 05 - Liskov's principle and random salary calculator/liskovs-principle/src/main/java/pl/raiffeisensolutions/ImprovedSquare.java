package pl.raiffeisensolutions;

public class ImprovedSquare {
    private Rectangle innerRectangle;

    public ImprovedSquare(int sideLength) {
        innerRectangle = new Rectangle(sideLength, sideLength);
    }

    public void setSide(int side) {
        innerRectangle.setWidth(side);
        innerRectangle.setHeight(side);
    }

    public int getWidth() {
        return innerRectangle.getWidth();
    }

    public int getHeight() {
        return innerRectangle.getHeight();
    }
}
