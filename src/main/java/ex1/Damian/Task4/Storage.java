package ex1.Damian.Task4;

import java.util.*;

public class Storage {

    private final Map<String, List<String>> storageMap = new HashMap<>();



    public void addToStorage(String key, String value) {

        List<String> valueList = storageMap.get(key);

        if (valueList == null) {
            valueList = new ArrayList<>();
        }
        //       List<String> localList = new ArrayList<>();
        valueList.add(value);
        storageMap.put(key, valueList);
        storageMap.forEach((k, v) -> System.out.println("Klucz: " + k + " Wartość: " + v));
    }

    public void printValues(String key){

        if (storageMap.get(key) == null){
            System.out.println("This key doesn`t exist");
        }else {
            System.out.println(storageMap.get(key));
        }
    }

    public void findValues (String value){
      storageMap.forEach((k , v) -> {
          if (v.contains(value)){
              System.out.println(k);
      }
        });
    }

    public void findKeyWithStream (String value){
        storageMap.entrySet()
                .stream() //zamiana stream
                .filter(stringListEntry -> stringListEntry.getValue().contains(value)) // filtrowanie według podanej zasady
                .map(leftEntry -> leftEntry.getKey())
                .forEach(key -> System.out.println(key)); // wykonanie logiki przefiltrowanych elementów


        final var set = new HashSet<String>();
        set.add("pies");
        set.remove("pies");
        set.size();
        set.contains("pies");
        set.clear();



    }

    public class SDAHashSet {
        private final List<String> valueList = new ArrayList<>();


        public boolean add(String value){
            return valueList.add(value);

        }

    }

}
