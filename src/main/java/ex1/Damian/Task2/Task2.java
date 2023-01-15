package ex1.Damian.Task2;

import java.util.ArrayList;


public class Task2 {
    public static void main(String[] args) {


        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("Bartosz");
        unsortedStrings.add("Małgorzata");
        unsortedStrings.add("damian");
        unsortedStrings.add("natalia");
        System.out.println(unsortedStrings);

        final var sorter = new LoopSorter();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("Result: "  + result);
    }
}