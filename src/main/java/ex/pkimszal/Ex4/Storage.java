package ex.pkimszal.Ex4;

import java.util.*;

public class Storage {
    private Map<String, List<String>> storageMap = new HashMap<>();


    public void addToStorage(String key, String name) {

        List<String> valueList = storageMap.get(key);

        if (valueList == null){
            valueList = new ArrayList<>();
        }
        valueList.add(name);

        storageMap.put(key, valueList);
        storageMap.forEach((k, v) -> System.out.println("Klucz: " + k + ", " + "Wartosc: " + v));
    }

    public void printValues(String key){
        if (storageMap.get(key) == null) {
            System.out.println("This key is not exist");
        } else {
            System.out.println(storageMap.get(key));
        }
    }

    public void findKeys(String value){
        storageMap.forEach((k, valueList) -> {
            if (valueList.contains(value)){
                System.out.println(k);
            }
        });
    }


//    public void findKeysWithStream(String value) {
//        storageMap.entrySet().stream() // zamiana na elemnty kolekcji (entrySet) i zamiana na stream
//                .filter(stringListEntry -> stringListEntry.getValue().contains(value)) // filtrowanie wedlug podanej zasdady
//                .map(leftEntry -> leftEntry.getKey()) // przemapowanie entry na key
//                .forEach(key -> System.out.println(key); // wykonanie logiki na przefiltrowanych elementach


//        final var set = new HashSet<String>();
//        set.add("pies");
//        set.remove("pies");
//        set.size();
//        set.contains("pies");
//        set.clear();
//
//    }
}
