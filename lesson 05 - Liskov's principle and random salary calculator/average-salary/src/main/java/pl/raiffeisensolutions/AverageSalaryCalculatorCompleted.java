package pl.raiffeisensolutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class AverageSalaryCalculatorCompleted {
    private static final MathContext ROUNDING = new MathContext(5, RoundingMode.HALF_UP);
    private NumberFormat currencyInstance;

    AverageSalaryCalculatorCompleted(Locale locale) {
        currencyInstance = DecimalFormat.getCurrencyInstance(locale);
        ((DecimalFormat) currencyInstance).setParseBigDecimal(true);
    }

    BigDecimal calculate(String inputFile) {
        return calculateAverage(
                parseSalaries(
                        getSalaryColumn(
                                removeHeader(
                                        assertAtLeasOneLineWithData(
                                                readLines(inputFile))))));
    }

    private List<String> assertAtLeasOneLineWithData(List<String> lines) {
        if (lines == null || lines.size() < 2) {
            throw new RuntimeException("Too few lines to calculate average");
        }
        return lines;
    }

    private BigDecimal calculateAverage(List<BigDecimal> salaries) {
        BigDecimal numberOfSalaries = new BigDecimal(salaries.size());
        return sum(salaries)
                .divide(numberOfSalaries, ROUNDING);
    }

    private BigDecimal sum(List<BigDecimal> salaries) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal salary : salaries) {
            sum = sum.add(salary);
        }
        return sum;
    }

    private List<BigDecimal> parseSalaries(List<String> salaryStrings) {
        List<BigDecimal> lines = new ArrayList<>();
        for (String salaryString : salaryStrings) {
            lines.add(parseSalary(salaryString));
        }
        return lines;
    }

    private BigDecimal parseSalary(String salaryString) {
        try {
            return (BigDecimal) getNumberFormat().parse(salaryString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private NumberFormat getNumberFormat() {
        return currencyInstance;
    }

    private List<String> getSalaryColumn(List<String> csvLinesWithoutHeader) {
        List<String> lines = new ArrayList<String>();
        for (String line : csvLinesWithoutHeader) {
            lines.add(getSalaryColumn(line));
        }
        return lines;
    }

    private String getSalaryColumn(String line) {
        return line.split(";")[1];
    }

    private List<String> removeHeader(List<String> lines) {
        return lines.subList(1, lines.size() - 1);
    }

    private List<String> readLines(String inputFile) {
        List<String> lines = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(inputFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        return lines;
    }
}
