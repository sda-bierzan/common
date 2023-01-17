package ex2;

public class Ex3Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("animal","horse");
        storage.addToStorage("animal","dog");
        storage.addToStorage("animal","cat");
        storage.addToStorage("animal","swniowca");
        storage.printValues("animal");

        storage.addToStorage("Car", "Merc");
        storage.addToStorage("Car", "BMW");
        storage.printValues("rar");


        }

    }

