package ex1.michalw.task2;

import java.util.Comparator;
import java.util.List;

public class ListSorter2 {
    public List<String> sortDisc(List<String> unsortedList){
        unsortedList.sort(Comparator.reverseOrder());
        return unsortedList;
    }


}
