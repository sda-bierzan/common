package ex1.malgasziZad.task1;

import java.util.Comparator;
import java.util.List;

class ListSorter {

    public List<String> sortDesc(List<String>unsortedList){
        unsortedList.sort(Comparator.reverseOrder());
        return unsortedList;
    }
}
