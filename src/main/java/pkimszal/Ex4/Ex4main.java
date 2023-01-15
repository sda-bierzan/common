package pkimszal.Ex4;

public class Ex4main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("animal", "horse");
        storage.addToStorage("animal", "dog");
        storage.addToStorage("animal", "cat");
        storage.addToStorage("animal", "lion");
        storage.addToStorage("car", "bmw");
        storage.addToStorage("car", "audi");
        storage.addToStorage("car", "dog");

        storage.printValues("animal");
        storage.printValues("car");
        storage.printValues("book");
        storage.findKeys("dog");
    }
}
