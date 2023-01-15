package ex1.malgasziZad.task3;

import java.util.Map;

public class task3MapPrint {
    public void print(Map<String, Integer> mapToPrint){
        mapToPrint.forEach((k,v)-> {
                    System.out.println("" + k + "  " + v);
                });
       // System.out.println();

    }
}
