package pl.raiffeisensolutions;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

class AverageSalaryCalculator {
    AverageSalaryCalculator(Locale locale) {
        // TODO create currency parser here and store it for the needs of salary parsing
    }

    BigDecimal calculate(String inputFile) {
        // TODO use the other methods to calculate average salary. There is no need to use variables here.
    }

    private BigDecimal calculateAverage(List<BigDecimal> salaries) {
        // TODO calculate average of the passed salaries
    }

    private List<BigDecimal> parseSalaries(List<String> salaryStrings) {
        // TODO return BigDecimal representation of the salary
    }

    private List<String> getSalaryColumn(List<String> csvLinesWithoutHeader) {
        // TODO trim all the lines ton contain only salary column i.e. from every line in format "John Smith;999999" create "999999"
    }

    private List<String> removeHeader(List<String> lines) {
        // TODO remove the first line of the file containing the header
    }

    private List<String> readLines(String inputFile) {
        // TODO read all the lines of the file and store them as a list
    }
}
