package Aircraft;

import Avto.InvalidParamException;

public abstract class Aircraft {
    private final int AMOUNT_WINGS = 2;
    private int amountOfChassis;
    private Chassis chassis;
    private CraftEngine craftEngine;
    private Wing craftWing;

    public Aircraft() {
    }

    public Aircraft(int amountOfChassis,
                    Chassis chassis,
                    CraftEngine craftEngine,
                    Wing craftWing) throws InvalidParamException {
        if (amountOfChassis < 2 || amountOfChassis > 15 || chassis == null || craftEngine == null || craftWing == null) {
            new InvalidParamException();
        }
        this.amountOfChassis = amountOfChassis;
        this.chassis = chassis;
        this.craftEngine = craftEngine;
        this.craftWing = craftWing;
    }

    public void setAmountOfChassis(int amountOfChassis) {
        if (amountOfChassis < 2 || amountOfChassis > 15) {
            System.out.println("Uncorrect parameter. Field amountOfChassis wasn't changed");
            return;
        }
        this.amountOfChassis = amountOfChassis;
    }

    public void setChassis(Chassis chassis) {
        if (chassis == null) {
            System.out.println("Uncorrect parameter. Field chassis wasn't changed");
            return;
        }
        this.chassis = chassis;
    }

    public void setCraftEngine(CraftEngine craftEngine) {
        if (craftEngine == null) {
            System.out.println("Uncorrect parameter. Field craftEngine wasn't changed");
            return;
        }
        this.craftEngine = craftEngine;
    }

    public void setCraftWing(Wing craftWing) {
        if (craftWing == null) {
            System.out.println("Uncorrect parameter. Field craftWing wasn't changed");
            return;
        }
        this.craftWing = craftWing;
    }

    public int getAmountOfChassis() {
        return amountOfChassis;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public CraftEngine getCraftEngine() {
        return craftEngine;
    }

    public Wing getCraftWing() {
        return craftWing;
    }

    public void makeRoute(String startPoint, String secondPoint) {
        System.out.println("Маршрут из " + startPoint + " в " + secondPoint + " проложен.");
    }

    public abstract void fly();
}
