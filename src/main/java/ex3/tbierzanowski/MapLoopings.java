package ex3.tbierzanowski;

import java.util.Map;

class MapLoopings {
    public static void main(String[] args) {

        final var map = Map.of(
                "a", 101,
                "b", 99,
                "c", 1
        );

        System.out.println("FIRST LOOP");
        map.forEach((k,v) -> System.out.println(k + v));

        System.out.println("\nSECOND LOOP");
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + entry.getValue()));


        final var iterator = map.entrySet().iterator();

        System.out.println("\nINTERATOR LOOP");
        while (iterator.hasNext()){ //dopóki jest następny to:
            final var nextEntry = iterator.next(); //pobierz nastepny
            //sprawdź czy jest nastepny, jesli tak to wstaw przecinek, jesli nie to kropka

            System.out.println(nextEntry.getKey() + nextEntry.getValue()); //drukuj z kropką lub przecinkiem
        }
    }
}
