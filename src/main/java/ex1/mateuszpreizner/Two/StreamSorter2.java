package ex1.mateuszpreizner.Two;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

    public class StreamSorter2 {
        public List<String> sortDesc2(List<String> unsortedList2) {
            return unsortedList2.stream()
                    .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                    .collect(Collectors.toList());

        }
    }
