package ex1.mateuszpreizner.Four;

import java.util.List;
import java.util.Map;

public class ExerciseFour {

    //  Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
    //  addToStorage(String key, String value) → dodawanie elementów do przechowywalni
    //  printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
    //  findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
    //
    //  Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("animals", "horse");
        storage.addToStorage("animals", "dog");
        storage.addToStorage("animals", "cat");
        storage.addToStorage("animals", "pig");
        storage.addToStorage("cars", "mercedes");
        storage.addToStorage("cars", "bmw");
        storage.addToStorage("cars", "wolksvagen");
        storage.addToStorage("cars", "ferrari");

        storage.printValues("cars");

        storage.findKeys("ferrari");
    }



}
