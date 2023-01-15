package ex3.jkaminska;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapLoopIterator {

    public static void main(String[] args) {

        final var map = Map.of(
                "a", 101,
                "b", 99,
                "c", 1
        );

        System.out.println("FIRST LOOP");
        map.forEach((k, v) -> System.out.println(k + v));

        System.out.println("\nSECOND LOOP");
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + entry.getValue()));


        final var iterator = map.entrySet().iterator();

        System.out.println("\nINTERATOR LOOP");
        while (iterator.hasNext()) { //dopóki jest następny to:
            final var nextEntry = iterator.next(); //pobierz nastepny
            //sprawdź czy jest nastepny, jesli tak to wstaw przecinek, jesli nie to kropka

            System.out.println(nextEntry.getKey() + nextEntry.getValue()); //drukuj z kropką lub przecinkiem
        }
    }

//    private printMapValue(String key) {
//        final var map = new HashMap<String, String>();
////klasyczny nullcheck
//        if (map.get(key) == null) {
//            System.out.println("jest null");
//        } else {
//            System.out.println("nie jest null");
//        }
//        //ekwiwalent z optionalem
//        Optional.ofNullable(map.get(key)) //wartość opcjonalna
//                .ifPresentOrElse(
//                        value -> System.out.println("jest nie null"), //wykona się tylko jak nie jest null
//                        () -> System.out.println("jest null") //wykona sie tylko jesli wartosc jest null
//                );
//        //   .ifPresent(value -> System.out.println("jest nie null")); //wykona się tylko jak nie jest null
//    }
}

