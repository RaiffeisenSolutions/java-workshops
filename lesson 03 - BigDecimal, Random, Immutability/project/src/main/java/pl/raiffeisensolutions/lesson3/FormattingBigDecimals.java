package pl.raiffeisensolutions.lesson3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class FormattingBigDecimals {
    public static void main(String[] args) {
        BigDecimal myNumber = new BigDecimal("1115.37");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat usCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat plCurrencyFormatter = NumberFormat.getCurrencyInstance(new Locale("pl", "PL"));
        System.out.println(currencyFormatter.format(myNumber));
        System.out.println(usCurrencyFormatter.format(myNumber));
        System.out.println(plCurrencyFormatter.format(myNumber));
    }
}
