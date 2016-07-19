package pl.raiffeisensolutions.lesson3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    currencyInstance.format(BigDecimal.valueOf(10000.0 * random.nextDouble())));
        }
    }
}
