# Exercise 1
## Random number generators
What is the following program going to print out?

```
import java.util.Random;

public class RandomStrings {
    public static void main(String[] args) {
        System.out.println(randomString(-229985452) + " " + randomString(-147909649));
    }

    public static String randomString(int seed) {
        Random random = new Random(seed);
        StringBuilder builder = new StringBuilder();
        while (true) {
            int randomNumber = random.nextInt(27);
            if (randomNumber == 0)
                break;

            builder.append((char)('`' + randomNumber));
        }

        return builder.toString();
    }
}
```

1. Very long number
2. Two random strings separated with spacebar, without any '`'
3. Hello world
4. Two random strings separated with spacebar, with possible '`'
5. The program won't compile

# Exercise 2
Write a function to generate and print random currency rate. It's definition looks as follows
```
public static void printRandomCurrencyRate(BigDecimal minValue, BigDecimal maxValue, BigDecimal minSpread, BigDecimal maxSpread) {
    BigDecimal center = ...;
    BigDecimal ask = ...;
    BigDecimal bid = ...;
    System.out.println("Ask: " + ask + ", bid: " + bid + ", center: " + center);
}
```

# Exercise 3
Write a program calculating average salary from report:
```
name;salary
John;5.634,01 €
Caroline;1.019,39 €
Tom;7.591,06 €
David;8.073,53 €
Martin;1.413,06 €
Robert;1.477,76 €
Jessica;1.483,06 €
Alexandra;4.821,18 €
Xavier;4.862,12 €
Elizabeth;9.420,75 €
```
Load the file from disk, parse numbers and calculate average salary.