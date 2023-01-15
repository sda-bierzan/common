package ex1.malgasziZad.task3;

import java.util.HashMap;
import java.util.Map;

public class task3Map {
    public static void main(String[] args) {
        Map<String,Integer> mapValue = new HashMap<>();
        mapValue.put("Gosia", 12);
        mapValue.put("Tola", 14);
        mapValue.put("Marek", 16);
        mapValue.put("Eryk", 8);
        task3MapPrint printer = new task3MapPrint();
        printer.print(mapValue);

    }
}
