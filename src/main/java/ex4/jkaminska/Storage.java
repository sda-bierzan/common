package ex4.jkaminska;

import java.awt.*;
import java.util.*;
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
    public void findKeysWithStream(String value){
        storageMap.entrySet()//zamiana na element kolekcji
                .stream() //zamiana na stream
                .filter(stringListEntry -> stringListEntry.getValue().contains(value)) //filtrowanie wedlug podanej zasady
                .map(leftEntry -> leftEntry.getKey()) //mapowanie entry na key
                .forEach(key -> System.out.println(key)); //wykonanie logiki na przefiltrowanych elementach

//        public void findKeysWithStream(String value){
//            storageMap.entrySet()//zamiana na element kolekcji
//                    .stream() //zamiana na stream
//                    .filter(stringListEntry -> stringListEntry.getValue().contains(value)) //filtrowanie wedlug podanej zasady
//                    .map(Map.Entry::getKey) //mapowanie entry na key
//                    .forEach(System.out::println); //wykonanie logiki na przefiltrowanych elementach

        final var set = new HashSet<String>();
        set.add("pies");
        set.remove("pies");
        set.size();
        set.contains("pies");
        set.clear();

    }
}


