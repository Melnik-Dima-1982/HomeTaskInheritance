
package Avto;

public class Engine {

    private double volumeOfEngine;
    private double powerOfEngine;
    private String typeOfFuel;

    public Engine() {
    }

    public Engine(double volumeOfEngine, double powerOfEngine, String typeOfFuel) throws InvalidParamException {
        if (volumeOfEngine <= 0 || volumeOfEngine >= 6 || powerOfEngine <= 0 || powerOfEngine > 800 ||
                typeOfFuel == null || typeOfFuel.isEmpty() || !typeOfFuel.equalsIgnoreCase("disel") ||
                !typeOfFuel.equalsIgnoreCase("gas") || !typeOfFuel.equalsIgnoreCase("gasoline")) {
            throw new InvalidParamException();
        }
        this.volumeOfEngine = volumeOfEngine;
        this.powerOfEngine = powerOfEngine;
        this.typeOfFuel = typeOfFuel;
    }

    public void setVolumeOfEngine(double volumeOfEngine) {
        if (volumeOfEngine <= 0 || volumeOfEngine >= 6.0) {
            System.out.println("Uncorrect parameter. Field volumeOfEngine wasn't changed");
            return;
        }
        this.volumeOfEngine = volumeOfEngine;
    }

    public void setPowerOfEngine(double powerOfEngine) {
        if (volumeOfEngine <= 0 || volumeOfEngine >= 800) {
            System.out.println("Uncorrect parameter. Field powerOfEngine wasn't changed");
            return;
        }
        this.powerOfEngine = powerOfEngine;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        if (!typeOfFuel.equalsIgnoreCase("disel") || !typeOfFuel.equalsIgnoreCase("gas") || !typeOfFuel.equalsIgnoreCase("gasoline")
                || typeOfFuel == null || typeOfFuel.isEmpty()) {
            System.out.println("Uncorrect parameter. Field typeOfFuel wasn't changed");
            return;
        }
        this.typeOfFuel = typeOfFuel;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public double getPowerOfEngine() {
        return powerOfEngine;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    @Override
    public String toString() {
        return "Engine {" +
                "volume - " + volumeOfEngine +
                ", power - " + powerOfEngine +
                ", type of fuel - " + typeOfFuel + "}.";
    }
}
