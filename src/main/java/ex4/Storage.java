package ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

   // private Map<String, List<String>>storageMap;
   private Map<String, List<String>>storageMap= new HashMap<>();


    public void addToStorage(String key, String name) {
        List<String> valueList =storageMap.get(key);
    //    List<String> nameList = new ArrayList<>();
        if (valueList == null) {
            valueList = new ArrayList<>();
        }
        valueList.add(name);

        storageMap.put(key,valueList);
        storageMap.forEach((k,v)-> System.out.println("k:" + k + "v:" + v));
    }

    /*public Storage() {S
        this.storageMap = new HashMap<>();*/

    public void printValues(String key) {

        if (storageMap.get(key) == null) {
            System.out.println("This key doesn't exist");
        } else {
            System.out.println(storageMap.get(key));
        }

    }

    }

