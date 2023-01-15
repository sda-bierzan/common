package ex1.michalw;

import java.awt.*;
import java.util.Collections;
import java.util.Comparator;

public class ListSorter {
    public List<String> sortDisc(List<String> unsortedList){
        unsortedList.sort(Comparator.reverseOrder());
        return unsortedList;
    }

    public void sortDisc() {
    }
}
