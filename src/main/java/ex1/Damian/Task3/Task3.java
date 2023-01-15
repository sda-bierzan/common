package ex1.Damian.Task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<String,Integer> mapValue = new HashMap<>();
        mapValue.put("Damian" , 18);
        mapValue.put("Tomasz" , 1);
        mapValue.put("Natalia" , 8);
        mapValue.put("Michal" , 14);
        MapPrinter printer = new MapPrinter();

        printer.print(mapValue);
    }
}
