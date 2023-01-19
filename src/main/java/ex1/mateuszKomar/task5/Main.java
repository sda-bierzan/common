package ex1.mateuszKomar.task5;

public class Main {
    public static void main(String[] args) {
        SDAHashSet sdaHashSet = new SDAHashSet();
        System.out.println("############# Metoda add ##############");
        sdaHashSet.add("Mateusz");
        sdaHashSet.add("Bartek");
        sdaHashSet.add("Olga");
        sdaHashSet.add("Ziutek");
        System.out.println(sdaHashSet);

        System.out.println("######### Metoda remove ##############");

        sdaHashSet.isRemoved("Mateusz");
        System.out.println(sdaHashSet);

        System.out.println("############## Metoda size ##############");

        System.out.println("The size of the sdaHashSet is:  " + sdaHashSet.size());

        System.out.println("############## Metoda contains ##############");

        sdaHashSet.myContains("Bartek");
        System.out.println();
        System.out.println(sdaHashSet);
        System.out.println();
        System.out.println("############## Metoda clear ##############");
        sdaHashSet.clearElements();



    }

}
