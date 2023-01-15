package ex3.jkaminska;

import java.util.HashMap;
import java.util.Map;

public class Ex3Main {
    public static void main(String[] args) {

        Map<String,Integer> mapValue = new HashMap<>();
        mapValue.put("Damian", 20);
        mapValue.put("Julia", 50);
        mapValue.put("Kasia", 49);
        mapValue.put("Michał", 7);

        MapPrinter printer = new MapPrinter();
        printer.print(mapValue);

    }
}
