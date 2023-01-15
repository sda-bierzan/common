package ex1.mateuszKomar.task4;

public class Task4Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("animals", "horse");
        storage.addToStorage("animals", "dog");
        storage.addToStorage("animals", "cat");
        storage.addToStorage("animals", "Merc");


        storage.addToStorage("cars", "Merc");
        storage.addToStorage("cars", "BMW");
        storage.addToStorage("cars", "Audi");
        storage.addToStorage("cars", "dog");



        storage.printValues("Animal");
        storage.printValues("cars");
        storage.printValues("books");

        System.out.println("**************************************");

        storage.findKeys("dog");

        System.out.println("##### with Stream #########");

        storage.findKeysWitchStream("Merc");



    }
}
