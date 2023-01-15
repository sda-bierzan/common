package ex4;

public class Ex4Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("animal", "horse");
        storage.addToStorage("animal", "dog");
        storage.addToStorage("animal", "cat");
        storage.addToStorage("animal", "pig");
        storage.printValues("animal");

        storage.addToStorage("car", "mercedez");
        storage.addToStorage("car", "fiat");
        storage.addToStorage("car", "mazda");
    }
}
