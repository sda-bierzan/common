package ex1.jkaminska;

import java.util.ArrayList;
import java.util.List;

public class Ex1Main {
    public static void main(String[] args) {

        final var unsortedStrings = new ArrayList<String>();
      //  List<String> list = new ArrayList<>(); --> same as the one above
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");
        System.out.println("INPUT: " + unsortedStrings);

//        final var unsortedStrings2 = List.of(    //utowrzenie takiej listy nie pozwala jeej zmieniać
//                "Tomasz",
//                "Bartosz",
//                "Małgorzata"
//        );

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Małgorzata");
        expected.add("Bartosz");
        System.out.println("EXPECTED: " + expected);

        final var sorter = new StreamSorter();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("RESULT: " + result);

    }

}
