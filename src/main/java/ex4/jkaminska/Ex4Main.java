package ex4.jkaminska;

public class Ex4Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("animal" , "horse");
        storage.addToStorage("animal" , "cat");
        storage.addToStorage("animal" , "dog");
        storage.addToStorage("animal" , "mouse");
        storage.addToStorage("car" , "bmw");
        storage.addToStorage("car" , "honda");
        storage.addToStorage("car" , "dog");

        System.out.println("**********************");

        storage.printValues("animal");
        storage.printValues("car");
        storage.printValues("book");

        System.out.println("***************");
        storage.findKeys("dog");



    }
}
