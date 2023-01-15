package ex1.MateuszMarkiewicz;

import java.util.List;


    import java.util.List;

    class LoopSorter {

        public List<String> sortDesc(List<String> unsortedList){
            //unsorted odnosi się do listy 1

            for (int i = 0; i < unsortedList.size(); i++) {
                for (int j = i+1; j < unsortedList.size(); j++) {
                    if(unsortedList.get(i).compareTo(unsortedList.get(j)) < 0){
                        //wiemy że elementy należy zamienić miejscami
                        final var temp = unsortedList.get(j);
                        unsortedList.set(j, unsortedList.get(i));
                        unsortedList.set(i, temp);
                    }
                }

            }
            //unsorted odnosi się do listy 2 ??
            return unsortedList;
        }
    }
