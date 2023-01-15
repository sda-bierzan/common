package ex5;

import java.util.ArrayList;
import java.util.List;

public class SDAHashSet {
    private final List<String> valueList = new ArrayList<>();

    @Override
    public String toString() {
        return valueList.toString();
    }

    public boolean add(String value) {
        if (valueList.contains(value)){
            return false;
        }
        return valueList.add(value);

    }
}