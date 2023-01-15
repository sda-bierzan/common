package ex1;

import java.util.ArrayList;

public class bsurmaMain {
    public static void main(String[] args) {

        //Stwórz metodę, która jako parametr przyjmuje listę stringów,
        //następnie zwraca tą listę posortowaną alfabetycznie od Z do A.

        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");
        System.out.println("INPUT" + unsortedStrings);

        final var expected = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Małgorzata");
        unsortedStrings.add("Bartosz");

        System.out.println("EXPECTED" + expected);

        final var sorter = new LoopSorter();
        final var result = List<String> = sorter
        System.out.println("RESULT" + sorter.sortDesc(unsortedStrings));

    }
}
