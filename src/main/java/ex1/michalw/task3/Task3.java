package ex1.michalw.task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> mapValue = new HashMap<>();
        mapValue.put("Darek", 15);
        mapValue.put("Janusz", 10);
        mapValue.put("Mirek", 14);
        mapValue.put("Wojtek", 25);
        MapPrinter printer = new MapPrinter();
        printer.print(mapValue);
    }
}
