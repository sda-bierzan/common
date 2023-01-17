package ex1.mateuszKomar.task5;

public class Main {
    public static void main(String[] args) {
        SDAHashSet sdaHashSet = new SDAHashSet();
        System.out.println("############# Metoda add ##############");
        sdaHashSet.add("Mateusz");
        sdaHashSet.add("Bartek");
        System.out.println(sdaHashSet);

        System.out.println("######### Metoda Remove ##############");

        sdaHashSet.isRemoved("Mateusz");
        System.out.println(sdaHashSet);

        System.out.println("############## Metoda size ##############");

        System.out.println("The size of the sdaHashSet is:  " + sdaHashSet.size());



    }

}
