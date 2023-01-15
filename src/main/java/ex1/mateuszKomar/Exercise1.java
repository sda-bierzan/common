package ex1.mateuszKomar;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    //Stwórz metodę, która jako parametr przyjmuje listę stringów,
    // następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
    public static void main(String[] args) {
//        //Stwórz metodę, która jako parametr przyjmuje listę stringów,
//        następnie zwraca tą listę posortowaną alfabetycznie od Z do A.

        final var unsortedString = new ArrayList<String>();
        unsortedString.add("Tomasz");
        unsortedString.add("Bartosz");
        unsortedString.add("Małgorzata");
        System.out.println(unsortedString);

        final var expected = new ArrayList<String>();
        unsortedString.add("Tomasz");
        unsortedString.add("Małgorzata");
        unsortedString.add("Bartosz");

        final var sorter = new ListSorter();
        final var resolt = sorter.sortDesc(unsortedString);
//

}
}

