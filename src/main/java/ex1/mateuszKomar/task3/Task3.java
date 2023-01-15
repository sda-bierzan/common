package ex1.mateuszKomar.task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> mapValue = new HashMap<>();
        mapValue.put("Damian", 18);
        mapValue.put("Tomasz", 18);
        mapValue.put("Natalia", 18);
        mapValue.put("Michał", 18);

        MapPrinter printer = new MapPrinter();
        printer.print(mapValue);
    }
}
