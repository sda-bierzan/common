package ex1.michalw.task2;

import ex1.michalw.ListSorter;

import java.util.ArrayList;

public class Task2 {


    public static void main(String[] args) {

        final var unsortedString = new ArrayList<String>();
        unsortedString.add("Tomasz");
        unsortedString.add("Bartosz");
        unsortedString.add("Malgorzata");
        System.out.println(unsortedString);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Bartosz");
        expected.add("Malgorzata");

        final var sorter = new ListSorter();
        final var result = sorter.sortDisc(unsortedString);
    }
}



