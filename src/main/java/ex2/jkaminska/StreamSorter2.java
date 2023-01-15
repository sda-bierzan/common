package ex2.jkaminska;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorter2 {

    public List<String> sortDesc(List<String> unsortedList) {
        return unsortedList.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

    }
}
