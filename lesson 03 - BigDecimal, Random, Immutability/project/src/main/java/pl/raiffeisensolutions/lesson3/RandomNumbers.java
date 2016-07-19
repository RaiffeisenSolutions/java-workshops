package pl.raiffeisensolutions.lesson3;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(765);
        System.out.println("Random int: " + random.nextInt());
        System.out.println("Random 0-9: " + random.nextInt(10));
        System.out.println("Random double: " + random.nextDouble());
    }
}
