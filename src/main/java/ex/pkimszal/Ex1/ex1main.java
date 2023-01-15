package ex.pkimszal.Ex1;

import java.util.ArrayList;
import java.util.List;

public class ex1main {
    public static void main(String[] args) {


        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");

        final var unsortedStrings2 = List.of(
                "Tomasz",
                "Bartosz",
                "Małgorzata"
        );

        System.out.println("INPUT: " + unsortedStrings);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Małgorzata");
        expected.add("Bartosz");
        System.out.println("EXPECTED: " + expected);

        final var sorter = new StreamSorter();
        final var result = sorter.sortDesc(unsortedStrings2);
        System.out.println("RESULT: " + result);
    }

}
