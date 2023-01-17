package ex1;

import java.util.Map;

public class MapPrinter {

    public void print(Map<String, Integer> mapToPrint) {
        mapToPrint.forEach((k, v) -> {
            System.out.println("Klucz: " + k + ", Wartość: " + v + ",");

        });
        final var iterator = mapToPrint.entrySet().iterator();

        System.out.println("\nINTERATOR LOOP");
        while (iterator.hasNext()) { //dopóki jest następny to:
            final var nextEntry = iterator.next(); //pobierz nastepny
            if(iterator.hasNext()){
                System.out.println("Klucz: " + nextEntry.getKey() + ", Wartość: " + nextEntry.getValue() + ",");
            }else
                System.out.println("Klucz: " + nextEntry.getKey() + ", Wartość: " + nextEntry.getValue() + ".");
            //sprawdź czy jest nastepny, jesli tak to wstaw przecinek, jesli nie to kropka

            //drukuj z kropką lub przecinkiem

        }
    }
}

