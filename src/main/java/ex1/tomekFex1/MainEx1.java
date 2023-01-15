package ex1.tomekFex1;

import java.util.ArrayList;
import java.util.List;

public class MainEx1 {
    public static void main(String[] args) {
        //Stwórz metodę, która jako parametr przyjmuje listę stringów
        // następnie zwraca tę listę posortowaną alfabetycznie od Z do A

        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");
        System.out.println(unsortedStrings);


        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Małgorzata");
        expected.add("Bartosz");
        System.out.println("EXPECTED: " + expected);

        final var sorter = new ListSorter();
        final var result= sorter.sortDesc(unsortedStrings);
        System.out.println("Result: " + result);

    }
}