package pl.raiffeisensolutions.lesson3;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsingBigDecimals {
    public static void main(String[] args) {
        parseDouble();
        parseBigDecimal();
    }

    private static void parseBigDecimal() {
        try {
            String toParse = "1.115,37 €";
            NumberFormat spanishParser = DecimalFormat.getInstance(new Locale("es", "ES"));
            ((DecimalFormat) spanishParser).setParseBigDecimal(true);
            Number parsed = spanishParser.parse(toParse);
            BigDecimal parsedBigDecimal = (BigDecimal) parsed;
            System.out.println("Parsed number: " + parsedBigDecimal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseDouble() {
        try {
            String toParse = "1.115,37 €";
            NumberFormat parser = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
            Number parse = parser.parse(toParse);
            Double parsedDouble = (Double) parse;
            System.out.println("Parsed number: " + parsedDouble);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
