package ex1.michalw;

import java.awt.*;

public class LoopSorter {
    public List<String> sortDisc(List<String> unsortedList){
        for (int i = 0; i < unsortedList.size(); i++) {
            for (int j = i+1; j < unsortedList.size(); j++) {
                if (unsortedList.get(i).compareTo(unsortedList.get(j)) <0){
                    final var temp: String = unsortedList.get(j);
                    unsortedList.set(j, unsortedList.get(i));
                    unsortedList.set(i, temp);

                    }
                }

            }
         return unsortedList;
        }
    }
