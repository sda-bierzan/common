package ex1;

import java.util.List;

public class LoopSorter {
    public List<String> sortDesc(List<String> unsortedList){
        for(int i=0; i<unsortedList.size(); i++){
            for (int j=i+1; j<unsortedList.size(); j++){
                if (unsortedList.get(i).compareTo(unsortedList.get(j))<0){
                    //wiemy że elementy należy zamienić miejscami
                    final var temp = unsortedlist.get(j);
                    unsortedList.set(j, unsortedList.get(i));
                    unsortedList.set(i,temp);

                }
            }
        }
    }
}
