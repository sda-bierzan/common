package ex1.pkimszal.Ex3;

import java.util.Map;

public class MapPrinter {

    public void print (Map<String, Integer> mapToPrint){
        mapToPrint.forEach((k, v) -> {
            System.out.println("Klucz: " + k + ", " + "Wartosc: " + v);
        });
    }
}
