package ex1.MarcinT;

import java.sql.Array;
import java.util.ArrayList;

public class Ex01Main {
    public static void main(String[] args) {
        System.out.println("test Ex01Main");

        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");
        System.out.println("Unsorted: " + unsortedStrings);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Małgorzata");
        expected.add("Bartosz");
        System.out.println("Expected:  " + expected);

        final var sorter = new ListSorterM();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("Result: " + result);
    }
}
