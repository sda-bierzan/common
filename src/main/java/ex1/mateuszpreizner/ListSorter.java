package ex1.mateuszpreizner;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public List<String> sortDesc(List<String> unsortedList){
        unsortedList.sort(Comparator.reverseOrder());
        return unsortedList;
    }
}
