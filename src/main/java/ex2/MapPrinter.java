package ex2;

import java.util.Map;

public class MapPrinter {
    public void print(Map<String, Integer> mapToPrint) {
        mapToPrint.forEach((k, v) -> {
            System.out.println("Key: " + k + " , " + "Value:" + v + " , ");
        });

        final var iterator = mapToPrint.entrySet().iterator();

        System.out.println("\nINTERATOR LOOP");
        while (iterator.hasNext()) { //dopóki jest następny to:
            final var nextEntry = iterator.next(); //pobierz nastepny
            //sprawdź czy jest nastepny, jesli tak to wstaw przecinek, jesli nie to kropka
            if (iterator.hasNext())
                System.out.println("Key: " + nextEntry.getKey() + " , " + "Value:" + nextEntry.getValue() + " , ");
            else
                System.out.println("Key: " + nextEntry.getKey() + " , " + "Value:" + nextEntry.getValue() + " .");
        }


    }
}
