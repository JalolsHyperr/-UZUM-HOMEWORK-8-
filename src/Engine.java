public class Engine {
    private String pedalSize;

    public Engine(String pedalSize) {
        this.pedalSize = pedalSize;
    }

    public String getPedalSize() {
        return pedalSize;
    }

    public void setPedalSize(String pedalSize) {
        this.pedalSize = pedalSize;
    }

    @Override
    public String toString() {
        return "Engine{pedalSize='" + pedalSize + "'}";
    }
}
