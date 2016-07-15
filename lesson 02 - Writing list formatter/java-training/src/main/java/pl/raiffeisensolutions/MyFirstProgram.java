package pl.raiffeisensolutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello world");
        List<String> names = getNames();
        System.out.println("Names: " + names);
        System.out.println("Names: " + names.toString());
        System.out.println("Names: " + formatList(names));
        System.out.println("Names: " + formatList(names, "{", "}", "-"));
        System.out.println("Names: " + formatWithStringJoin(names));
        System.out.println("Names: " + formatWithStringJoiner1(names));
        System.out.println("Names: " + formatWithStringJoiner2(names));
    }

    private static String formatList(List<String> names) {
        return formatList(names, "(", ")", ";");
    }

    private static String formatList(List<String> names, String open, String close, String delimiter) {
        String result = open;
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            result += iterator.next();
            if (iterator.hasNext()) {
                result += delimiter;
            }
        }
        result += close;
        return result;
    }

    private static String formatWithStringJoin(List<String> names) {
        return "(" + String.join(";", names) + ")";
    }

    private static String formatWithStringJoiner1(List<String> names) {
        StringJoiner stringJoiner = new StringJoiner("=", "(", ")");
        for (String name : names) {
            stringJoiner.add(name);
        }
        return stringJoiner.toString();
    }

    private static String formatWithStringJoiner2(List<String> names) {
        StringJoiner stringJoiner = new StringJoiner("=", "(", ")");
        names.forEach(stringJoiner::add);
        return stringJoiner.toString();
    }

    private static List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Karol");
        names.add("Robert");
        return names;
    }
}