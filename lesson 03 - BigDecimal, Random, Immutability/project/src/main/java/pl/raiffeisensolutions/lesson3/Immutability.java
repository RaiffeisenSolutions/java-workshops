package pl.raiffeisensolutions.lesson3;

public class Immutability {
    public static void main(String[] args) {
        immutableVersion();
        mutableVersion();
    }

    private static void mutableVersion() {
        StringBuilder name = new StringBuilder("Jan");
        StringBuilder secondReference = name;

        name.append(" Kowalski");
        System.out.println("name: " + name);
        System.out.println("secondReference: " + secondReference);
    }

    private static void immutableVersion() {
        String name = "Jan";
        String secondReference = name;

        name += " Kowalski";
//        name = name + " Kowalski";

        System.out.println("name: " + name);
        System.out.println("secondReference: " + secondReference);
    }
}
