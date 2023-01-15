package ex1.pkimszal;

import java.util.ArrayList;
import java.util.List;

public class ex1main {
    public static void main(String[] args) {


        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Pjoter");
        unsortedStrings.add("Bartunia");
        System.out.println("INPUT: " + unsortedStrings);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Bartunia");
        expected.add("Pjoter");
        System.out.println("EXPECTED: " + expected);

        final var sorter = new LoopSorter();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("RESULT: " + result);

    }

}
