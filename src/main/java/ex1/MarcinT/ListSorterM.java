package ex1.MarcinT;

import java.util.Comparator;
import java.util.List;

public class ListSorterM {

    public List<String> sortDesc(List<String> unsortedList){
        unsortedList.sort(Comparator.reverseOrder());
        return unsortedList;
    }
}
