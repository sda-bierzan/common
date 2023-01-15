package pkimszal.Ex5;

import java.util.ArrayList;
import java.util.List;

public class SDAHashSet {
//    private final String[] set = new String[0];
//    List / Map []


    private final List<String> valueList = new ArrayList<>();

    @Override
    public String toString() {
        return "valueList=" + valueList;
    }

    public boolean add(String value){
        if (valueList.contains(value)) {
            return false;
        }
        return valueList.add(value);
    }
}
