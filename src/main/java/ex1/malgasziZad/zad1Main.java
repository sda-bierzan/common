package ex1.malgasziZad;

import java.util.ArrayList;

//Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną
// alfabetycznie od Z do A.
public class zad1Main {
    public static void main(String[] args) {


        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Misiek");
        System.out.println("INPUT:" + unsortedStrings);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Misiek");
        expected.add("Bartosz");
        System.out.println("EXPECTED: " + expected);

        final var sorter = new StreamSorter();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("RESULT:" + result);
    }
}
