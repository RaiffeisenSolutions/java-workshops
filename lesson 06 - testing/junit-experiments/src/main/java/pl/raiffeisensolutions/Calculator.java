package pl.raiffeisensolutions;

public class Calculator {
    private Adder adder;
    private Multipler multipler;
    private Subtracter subtracter;

    public Calculator() {
        adder = new Adder();
        multipler = new Multipler();
        subtracter = new Subtracter();
    }

    public int add(int x, int y) {
        return adder.add(x, y);
    }

    public int multiply(int x, int y) {
        return multipler.multiply(x, y);
    }

    public int subtract(int x, int y) {
        return subtracter.subtract(x, y);
    }
}
