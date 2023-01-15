package ex1.malgasziZad.task2;

import ex1.malgasziZad.task2.LoppSorter2;

import java.util.ArrayList;
//Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie od
// Z do A nie biorąc pod uwagę wielkości liter.
public class task2Main {
    public static void main(String[] args) {


        final var unsortedStrings = new ArrayList<String>();
        unsortedStrings.add("Tomasz");
        unsortedStrings.add("bartosz");
        unsortedStrings.add("Misiek");
        System.out.println("INPUT:" + unsortedStrings);

        final var expected = new ArrayList<String>();
        expected.add("Tomasz");
        expected.add("Misiek");
        expected.add("bartosz");
        System.out.println("EXPECTED: " + expected);

        final var sorter = new LoppSorter2();
        final var result = sorter.sortDesc(unsortedStrings);
        System.out.println("RESULT:" + result);
    }
}
