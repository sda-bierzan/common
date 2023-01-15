package ex1.mateuszpreizner.Two;

import java.util.ArrayList;

public class ExerciseTwo {
    //Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą
    // listę posortowaną alfabetycznie od Z do A nie biorąc pod uwagę wielkości liter.

    public static void main(String[] args) {

        final var unsortedStrings2 = new ArrayList<String>();
        //List<String> list = new ArrayList<>();  to samo co powyzej
        unsortedStrings2.add("Tomasz");
        unsortedStrings2.add("Bartosz");
        unsortedStrings2.add("Małgorzata");
        unsortedStrings2.add("andrzej");
        unsortedStrings2.add("justyna");
        unsortedStrings2.add("Kaja");
        System.out.println(unsortedStrings2);

        final var sorter2 = new StreamSorter2();
        final var result2 = sorter2.sortDesc2(unsortedStrings2);
        System.out.println(sorter2.sortDesc2(unsortedStrings2));
        System.out.println(result2);
    }
}
