package ex3.jkaminska;

import java.util.Map;

public class MapPrinter {

   public void print (Map<String,Integer> mapToPrint){
       mapToPrint.forEach((k,v) -> {
           System.out.println("Klucz: " + k + " Wartość: " + v);
       });

   }
}
