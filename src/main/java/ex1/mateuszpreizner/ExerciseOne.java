package ex1.mateuszpreizner;

import java.util.ArrayList;
import java.util.List;

public class ExerciseOne {
    public static void main(String[] args) {

     final var unsortedStrings = new ArrayList<String>();
     //List<String> list = new ArrayList<>();  to samo co powyzej
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");
        System.out.println(unsortedStrings);

        final var sorter = new StreamSorter();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println(sorter.sortDesc(unsortedStrings));
        System.out.println(result);
    }
}
