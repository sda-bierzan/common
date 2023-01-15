package ex.pkimszal.Ex1;

import java.util.List;

public class ListSorter {

    public List<String> sortDesc(List<String> unsortedList) {
        unsortedList.sort(String.CASE_INSENSITIVE_ORDER.reversed());


        return unsortedList;
    }
}
