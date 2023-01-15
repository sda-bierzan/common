package ex1.tomekFex1;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public List<String> sortDesc(List<String> unsortedList){
        unsortedList.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        return unsortedList;
    }
}

