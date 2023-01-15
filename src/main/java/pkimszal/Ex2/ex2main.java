package pkimszal.Ex2;

import pkimszal.Ex1.StreamSorter;

import java.util.ArrayList;

public class ex2main {
    public static void main(String[] args) {
        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");
        unsortedStrings.add("damian");
        unsortedStrings.add("natalia");
        System.out.println("INPUT: " + unsortedStrings);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Małgorzata");
        expected.add("Bartosz");
        expected.add("damian");
        expected.add("natalia");
        System.out.println("EXPECTED: " + expected);

        final var sorter = new StreamSorter();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("RESULT: " + result);
    }
}
