package Aircraft;

import Avto.InvalidParamException;

public class CraftEngine {

    private double volumeOfEngine;
    private double powerOfEngine;

    public CraftEngine() {
    }

    public CraftEngine(double volumeOfEngine, double powerOfEngine) throws InvalidParamException {
        if (volumeOfEngine <= 500 || volumeOfEngine > 1200 || powerOfEngine <= 2200 || powerOfEngine > 5000) {
            new InvalidParamException();
        }
        this.volumeOfEngine = volumeOfEngine;
        this.powerOfEngine = powerOfEngine;
    }

    public void setVolumeOfEngine(double volumeOfEngine) {
        if (volumeOfEngine <= 500 || volumeOfEngine > 1200) {
            System.out.println("Uncorrect parameter. Field volumeOfEngine wasn't changed");
            return;
        }
        this.volumeOfEngine = volumeOfEngine;
    }

    public void setPowerOfEngine(double powerOfEngine) {
        if (powerOfEngine <= 2200 || powerOfEngine > 5000) {
            System.out.println("Uncorrect parameter. Field powerOfEngine wasn't changed");
            return;
        }
        this.powerOfEngine = powerOfEngine;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public double getPowerOfEngine() {
        return powerOfEngine;
    }

    @Override
    public String toString() {
        return "CraftEngine {" +
                "volume of engine - " + volumeOfEngine +
                ", power of engine - " + powerOfEngine +
                '}';
    }
}
