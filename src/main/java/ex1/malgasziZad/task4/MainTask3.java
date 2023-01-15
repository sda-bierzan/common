package ex1.malgasziZad.task4;

public class MainTask3 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToSttorage("Zwierzaki ", "pies");
        storage.addToSttorage("Zwierzaki ", "kot");
        storage.addToSttorage("Zwierzaki ", "szczur");
        storage.addToSttorage("Zwierzaki ", "rekin");
        storage.addToSttorage("Zwierzaki ", "rekin");
        storage.addToSttorage("Car", "rekin");



        storage.addToSttorage("Car ", "Mercedes");
        storage.addToSttorage("Car", "Fiat");
        storage.addToSttorage("Car ", "Punto");
        storage.printValues("Zwierzaki");
        storage.printValues("Car");

        storage.findKeys("rekin");

    }
}
