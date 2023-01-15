package ex1.mateuszKomar.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> storageMap = new HashMap<>();


    public void addToStorage(String key, String name) {

        List<String> valueList = storageMap.get(key);
        if (valueList == null) {
            valueList = new ArrayList<>();
        }

        valueList.add(name);
        storageMap.put(key, valueList);
        storageMap.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public void printValues(String key) {

        if (storageMap.get(key) == null) {
            System.out.println("Tis key doesn't ex");
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
    public void findKeysWitchStream(String value) {
        storageMap.entrySet().stream().filter(stringListEntry -> stringListEntry.getValue().contains(value))
                .forEach(leftEntry -> System.out.println(leftEntry.getKey()));
        }
}
