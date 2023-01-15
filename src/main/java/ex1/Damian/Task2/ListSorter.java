package ex1.Damian.Task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public List<String> sortDesc(List<String> unsortedList){
        unsortedList.sort(Comparator.reverseOrder());
        Collections.sort(unsortedList,Comparator.reverseOrder());
        return unsortedList;
    }
}
