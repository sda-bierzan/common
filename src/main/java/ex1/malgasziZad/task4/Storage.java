package ex1.malgasziZad.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
//addToStorage(String key, String value) → dodawanie elementów do przechowywalni
//printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
//findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
//
//Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
public class Storage {
    private Map<String, List<String>> storageMap = new HashMap<>();


    public void addToSttorage(String key, String name) {
        List<String> valueList = storageMap.get(key);
        //  valueList = new ArrayList<>();
        if (valueList == null) {
            valueList = new ArrayList<>();

        }
        valueList.add(name);
        storageMap.put(key, valueList);
        storageMap.forEach((k, v) -> System.out.println("" + k + "" + v));
    }

    public void printValues(String key) {
        //  System.out.println(storageMap.get(key));
        if (storageMap.get(key) == null) {
            System.out.println("This key is empty");
        } else {
            System.out.println(storageMap.get(key));
        }
    }

    public void findKeys(String value) {
        storageMap.forEach((k, valueList) -> {
            if (valueList.contains(value)) {
                System.out.println(k);
            }
        });
    }

}

