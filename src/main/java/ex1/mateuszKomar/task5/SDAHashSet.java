package ex1.mateuszKomar.task5;

import java.util.ArrayList;
import java.util.List;

public class SDAHashSet {
    private final List<String> valueList = new ArrayList<>();

    @Override
    public String toString() {
        return valueList.toString();
    }

    public boolean add(String value) {
        if (valueList.contains(value)) {
            return false;
        }
        return valueList.add(value);
    }


    public boolean isRemoved(String value) {
        if (valueList.contains(value)) {
            return valueList.remove(value);

        }
        return false;
    }

    public int size() {
        return valueList.size();
    }
        public boolean Contains(String T){
        if (valueList.contains(T)){
            System.out.println("List contains: " + T);

        }
        return false;
        }


}












