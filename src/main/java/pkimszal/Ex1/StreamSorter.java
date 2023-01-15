package pkimszal.Ex1;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSorter {
    public List<String> sortDesc(List<String> unsortedList){
        return unsortedList.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());
    }
}
