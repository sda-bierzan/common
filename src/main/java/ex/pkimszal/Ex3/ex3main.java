package ex.pkimszal.Ex3;

import java.util.HashMap;
import java.util.Map;

public class ex3main {
    public static void main(String[] args) {

        Map<String, Integer> mapValue = new HashMap<>();
        mapValue.put("Damian", 1);
        mapValue.put("Tomek", 2);
        mapValue.put("Bartek", 3);

        MapPrinter printer = new MapPrinter();
//        printer.print(mapValue);
    }
}
