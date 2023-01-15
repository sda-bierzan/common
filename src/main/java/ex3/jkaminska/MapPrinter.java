package ex3.jkaminska;

import java.util.Map;

public class MapPrinter {

    public void print(Map<String, Integer> mapToPrint) {
        final var iterator = mapToPrint.entrySet().iterator();

        System.out.println("\nINTERATOR LOOP");
        while (iterator.hasNext()) { //dopóki jest następny to:
            final var nextEntry = iterator.next(); //pobierz nastepny
            if (iterator.hasNext()) {
                System.out.println("Klucz: " + nextEntry.getKey() + ", " + "Wartość:" + nextEntry.getValue() + ",");
            } else {
                System.out.println("Klucz: " + nextEntry.getKey() + ", " + "Wartość:" + nextEntry.getValue() + ".");

            }
            //sprawdź czy jest nastepny, jesli tak to wstaw przecinek, jesli nie to kropka




        }
    }


}
