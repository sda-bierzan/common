package ex2.jkaminska;

import ex1.jkaminska.StreamSorter;

import java.util.ArrayList;

public class Ex2Main {
    public static void main(String[] args) {

        final var unsortedStrings = new ArrayList<String>();
        //  List<String> list = new ArrayList<>(); --> same as the one above
        unsortedStrings.add("tomasz");
        unsortedStrings.add("bartOsz");
        unsortedStrings.add("MałgoRzata");
        unsortedStrings.add("kasia");
        System.out.println("INPUT: " + unsortedStrings);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Małgorzata");
        expected.add("Bartosz");
        System.out.println("EXPECTED: " + expected);

        final var sorter = new LoopSorter2();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("RESULT: " + result);
    }

}

