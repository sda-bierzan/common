package ex3.tbierzanowski;

class MapLoopings {
    public static void main(String[] args) {
        map.forEach((k,v) -> System.out.println(k + v));

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + entry.getValue()));


        final var iterator = map.entrySet().iterator();

        while (iterator.hasNext()){ //dopóki jest następny to:
            final var nextEntry = iterator.next(); //pobierz nastepny
            //sprawdź czy jest nastepny, jesli tak to wstaw przecinek, jesli nie to kropka

            System.out.println(nextEntry.getKey() + nextEntry.getValue()); //drukuj z kropką lub przecinkiem
        }
    }
}
