package ex1.pkimszal.Ex2;

import java.util.Comparator;
import java.util.List;

public class LoopSorter {
    public List<String> sortDesc(List<String> unsortedList) {
        unsortedList.sort(Comparator.reverseOrder());

        for (int i = 0; i < unsortedList.size(); i++) {
            for (int j = i+1; j < unsortedList.size(); j++) {
                if(unsortedList.get(i).compareTo(unsortedList.get(j)) < 0) {
                    final var temp = unsortedList.get(j);
                    unsortedList.set(j, unsortedList.get(i));
                    unsortedList.set(i, temp);
                }
            }
        }

        return unsortedList;
    }
}
