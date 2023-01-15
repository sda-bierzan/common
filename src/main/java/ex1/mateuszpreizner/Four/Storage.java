package ex1.mateuszpreizner.Four;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    public void addToStorage(String key, String value) {

        List<String> keyValue = storageMap.get(key);
        if (keyValue == null){
            keyValue = new ArrayList<>();
        }

        keyValue.add(value);

        storageMap.put(key,keyValue);
        storageMap.forEach((k, v) -> System.out.println(k + ":" + v));

    }
    private Map<String, List<String>> storageMap;


    public Storage() {
        this.storageMap = new HashMap<>();
    }

    public void printValues(String key){
        if (storageMap.get(key) == null){
            System.out.println("This key deos not exist");
        }else System.out.println(storageMap.get(key));
    }


}
