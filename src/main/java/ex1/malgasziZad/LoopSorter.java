package ex1.malgasziZad;

import java.util.Comparator;
import java.util.List;

 class LoopSorter {
    public List<String> sortDesc(List<String> unsortedList) {
        for (int i = 0; i < unsortedList.size(); i++) {
            for (int j = 0; j < unsortedList.size(); j++) {
                if (unsortedList.get(i).compareTo(unsortedList.get(j))<0){
                    // wiemy że elementy należy zamienić miejscami
                    final var temp = unsortedList.get(j);
                    unsortedList.set(j, unsortedList.get(i));
                    unsortedList.set(i, temp);
                }

            }
        }
        return unsortedList;
    }
}
