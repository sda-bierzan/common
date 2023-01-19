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
        System.out.println("You removed: " + value);
        if (valueList.contains(value)) {
            return valueList.remove(value);

        }
        return false;
    }

    public int size() {
        return valueList.size();
    }
        public boolean myContains(String T){
        if (valueList.contains(T)){
            System.out.println("List contains: " + T);

        }
        return false;
        }
        public void clearElements(){
            System.out.println("Elements before clear: "+ valueList);
        valueList.clear();
            System.out.println("Elements after clear: " + valueList);
        }

}












