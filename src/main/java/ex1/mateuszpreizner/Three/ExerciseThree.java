package ex1.mateuszpreizner.Three;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExerciseThree {
    //Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string,
    // a wartością liczba, a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "".
    // Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
    //Przykład:
    //Klucz: Java, Wartość: 18,
    // Klucz: Python, Wartość: 1,
    //…
    //Klucz: PHP, Wartość: 0.

    public static void main(String[] args) {
        Map<String, Integer> someMap = new HashMap<>();
        someMap.put("Java", 18);
        someMap.put("Python", 1);
        someMap.put("PHP", 0);
        MapPrinter printer = new MapPrinter();
        printer.print(someMap);



    }

}
