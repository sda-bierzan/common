package ex1.michalw.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>>storageMap ;

    public Storage() {
        this.storageMap = new HashMap<>();

    }

    public void addToStorage(String key, String name) {

        List<String>valueList = storageMap.get(key);
        if (valueList == null){
            valueList = new ArrayList<>();
        }

     //   List<String> nameList = new ArrayList<>();
        valueList.add(name);

        storageMap.put(key,valueList);
        storageMap.forEach((k,v)-> System.out.println("k:"+k +" v" +v));

    }
    public void printValues(String key, String mouse){
        System.out.println(storageMap.get(key));
        if (storageMap.get(key) == null){
            System.out.println("This key is dosen`t exist");
        }else {
            System.out.println(storageMap.get(key));
        }

    }

    public void findKeys(String value){
        storageMap.forEach((k,valueList)-> {
            if(valueList.contains(value)){
                System.out.println(k);
            }
        });
    }
}
