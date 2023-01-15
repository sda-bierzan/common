package ex1.tbierzanowski;

import java.util.ArrayList;
import java.util.List;

class Ex1Main {
    public static void main(String[] args) {

        //Stwórz metodę, która jako parametr przyjmuje listę stringów,
        // następnie zwraca tą listę posortowaną alfabetycznie od Z do A.

        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");

        final var unsortedStrings2 = List.of(
                "Tomasz",
                "Bartosz",
                "Małgorzata"
        );

        System.out.println("INPUT: " +unsortedStrings2);

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
