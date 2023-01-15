package ex4.jkaminska;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Storage {
    private Map<String, List<String>> storageMap = new HashMap<>();


    public void addToStorage(String key, String name){

        List<String> valueList = storageMap.get(key);
        if (valueList == null){
            valueList = new ArrayList<>();
        }

       valueList.add(name);
        storageMap.put(key, valueList);
        storageMap.forEach((k,v) -> System.out.println("key: " + k + " value: " + v) );
    }
    public void printValues(String key){

        if (storageMap.get(key) == null){
            System.out.println("This key doesn't exist");
        }else{
            System.out.println(storageMap.get(key));
        }
    }
    public void findKeys(String value){
        storageMap.forEach((k,valuelist) -> {
           if (valuelist.contains(value)){
               System.out.println(k);
           }
        });
    }
}


