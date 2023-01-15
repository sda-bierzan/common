package ex2;

import java.util.Map;

public class MapPrinter {
    public void print(Map<String,Integer>mapToPrint){
        mapToPrint.forEach((k,v) -> {
            System.out.println("Key: "+ k + "Value:" + v);

        });
    }
}
