package ex1.tbierzanowski;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ListSorter {

    public List<String> sortDesc(List<String> unsortedList){
        unsortedList.sort(Comparator.reverseOrder());
        return unsortedList;
    }
}
