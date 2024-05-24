public class Car {
    private static int counter = 0;
    private int serialNumber;
    private Engine engine;

    public Car(String pedalSize) {
        this.serialNumber = ++counter;
        this.engine = new Engine(pedalSize);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{serialNumber=" + serialNumber + ", engine=" + engine + "}";
    }
}
