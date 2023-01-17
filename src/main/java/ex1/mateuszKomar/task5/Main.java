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













    }

}
