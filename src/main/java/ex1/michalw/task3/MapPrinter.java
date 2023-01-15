package ex1.michalw.task3;

import ex1.michalw.ListSorter;

import java.util.ArrayList;
import java.util.Map;

public class MapPrinter {
    public void print(Map<String, Integer> mapToPrint) {
        mapToPrint.forEach((k, v) -> {
            System.out.println("Klucz: " + k + " " + "Wartość: " + v + ",");
        });

        final var interior = mapToPrint.entrySet().iterator();

        System.out.println("\nINTERATOR LOOP");
        while (interior.hasNext()) {
            final var nextEntry = interior.next();
            if (interior.hasNext()) {
                System.out.println("Klucz: " + nextEntry.getKey() + " " + "Wartość: " + nextEntry.getValue() + ",");
             //   else{
             //       System.out.println("Klucz: " + nextEntry.getKey() + " " + "Wartość: " + nextEntry.getValue() + ",");
             //   }
            }


        }
    }
}
