package ex1.Damian.Task4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("Animal", "Cat");
        storage.addToStorage("Animal", "Dog");
        storage.addToStorage("Animal", "Horse");
        storage.addToStorage("Animal", "Mouse");
        storage.addToStorage("Car", "Marcedes");
        storage.addToStorage("Car", "Fiat");


        storage.printValues("Animal");
        storage.printValues("Car");
        storage.printValues("Books");


        storage.findValues("Mouse");
        storage.findKeyWithStream("Fiat");



    }
}
