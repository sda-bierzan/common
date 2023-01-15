package ex1.michalw.task3;

import java.util.Map;

public class MapPrinter {
    public void print(Map<String, Integer> mapToPrint){
        mapToPrint.forEach((k,v) -> {
            System.out.println("Klucz"+ k+ " " + v);
        });
    }
}
