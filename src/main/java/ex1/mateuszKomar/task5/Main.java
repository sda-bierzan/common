package ex1.mateuszKomar.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SDAHashSet sdaHashSet = new SDAHashSet();
        System.out.println("Metoda add");
        sdaHashSet.add("Mateusz");
        sdaHashSet.add("Bartek");
        System.out.println(sdaHashSet);

        System.out.println("Metoda Remove");

        sdaHashSet.isRemoved("Mateusz");
        System.out.println(sdaHashSet);












        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("B");
        list.add("A");

        System.out.println(list);

        boolean isRemoved = list.remove("C");
        System.out.println(list);
        System.out.println(isRemoved);

        isRemoved = list.remove("X");
        System.out.println(list);
        System.out.println(isRemoved);
    }

}
