package ex1.Damian;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");
        System.out.println(unsortedStrings);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Małgorzata");
        expected.add("Bartosz");
        System.out.println("Expected: " + expected);

//        final var sorter = new ListSorter();
//        final var result = sorter.sortDesc(unsortedStrings);
//        System.out.println("Result: "  + result);
//        final var sorter1 = new LoopSorter();
//        final var result1 = sorter1.sortDesc(unsortedStrings);
//        System.out.println("Result: "  + result1);

        final var sorter = new StreamSorter();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("Result: "  + result);
    }


}
