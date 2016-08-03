package pl.raiffeisensolutions;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BrokenSquare brokenSquare = new BrokenSquare(100);
        System.out.println("The dimensions of the square are " + brokenSquare.getHeight() + "x" + brokenSquare.getWidth());

        Rectangle rectangle = brokenSquare;
        rectangle.setHeight(150);
        System.out.println("The dimensions of the square are " + rectangle.getHeight() + "x" + rectangle.getWidth());

        ImprovedSquare improvedSquare = new ImprovedSquare(100);
        improvedSquare.setSide(200);
        System.out.println("The dimensions of the improved square are " + improvedSquare.getHeight() + "x" + improvedSquare.getWidth());

        BigDecimal bigDecimal = new BigDecimal("1.0");
    }
}
