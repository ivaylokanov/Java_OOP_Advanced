package pr03_ferrari;

public class Ferrari implements Drivable {
    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;

    }

    @Override
    public String pushBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushTheGasPedal() {
       return "Zadu6avam sA!";

    }

    @Override
    public String toString() {
        return String.format("488-Spider/%s/%s/%s",pushBrakes(),pushTheGasPedal(),this.driverName);
    }
}
