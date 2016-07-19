package pl.raiffeisensolutions.lesson3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ProblemWithDoubles {


    public static void main(String[] args) {
        howToUseBigDecimals();
        incrementAccount();
        operations();
    }

    private static void operations() {
        BigDecimal myNumber = new BigDecimal("1.5");
        BigDecimal floor = myNumber.round(new MathContext(1, RoundingMode.FLOOR));
        BigDecimal ceiling = myNumber.round(new MathContext(1, RoundingMode.CEILING));
        System.out.println("Round FLOOR: " + floor);
        System.out.println("Round CEILING: " + ceiling);
    }

    private static void incrementAccount() {
        BigDecimal accountBalance = new BigDecimal("0.0");
        System.out.println("Account balance: " + accountBalance);

        final BigDecimal TO_ADD = new BigDecimal("0.01");
        for (int i = 0; i < 100; i++) {
            accountBalance = accountBalance.add(TO_ADD);
        }
        System.out.println("Account Balance: " + accountBalance);
    }

    private static void howToUseBigDecimals() {
        double doubleValue = 0.7;
        System.out.println("doubleValue: " + doubleValue);
        String doubleAsString = Double.toString(doubleValue);
        System.out.println("doubleValue: " + doubleAsString);

        // Incorrect:
        BigDecimal valueOfDoubleValue = BigDecimal.valueOf(doubleValue);
        System.out.println(valueOfDoubleValue);

        // Incorrect
        BigDecimal newBigDecimalFromDoubleValue = new BigDecimal(doubleValue);
        System.out.println("newBigDecimalFromDoubleValue " + newBigDecimalFromDoubleValue);

        // Correct
        BigDecimal bigDecimalCreatedProperly = new BigDecimal("0.7");
        System.out.println("bigDecimalCreatedProperly: " + bigDecimalCreatedProperly);
    }
}
