package ex1.malgasziZad.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StremSorterTask2 {
    public List<String> sortDesc(List<String> unsortedList) {
        return unsortedList.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed()) //sorted przyjmuje klasy komperatora, ułoży nam rosnąco listę Stringów
                .collect(Collectors.toList());
    }
}
