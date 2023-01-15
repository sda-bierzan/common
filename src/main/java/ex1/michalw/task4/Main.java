package ex1.michalw.task4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("animal","horse");
        storage.addToStorage("animal","dog");
        storage.addToStorage("animal","cat");
        storage.addToStorage("rekin","fish");
        storage.addToStorage("mouse", "mouse");
        storage.addToStorage("car", "dog");
        storage.addToStorage("dragon", "mouse1");
        storage.addToStorage("dragon", "mouse1");


        storage.findKeys("rekin");
    }
}
