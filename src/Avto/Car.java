package Avto;

import java.awt.*;

public abstract class Car {
    public static final int AMOUNT_OF_WHEELS = 4;
    private Engine carEngine;
    private Wheel carWhell;
    private Color carColor;

    public Car() {
    }

    public Car(Engine carEngine, Wheel carWhell, Color carColor) throws InvalidParamException {
        if (carEngine == null || carWhell == null || carColor == null){
            throw new InvalidParamException();
        }
        this.carEngine = carEngine;
        this.carWhell = carWhell;
        this.carColor = carColor;
    }

    public void setCarEngine(Engine carEngine) {
        if (carEngine == null){
            System.out.println("Uncorrect parameter. Field size wasn't changed");
            return;
        }
        this.carEngine = carEngine;
    }

    public void setCarWhell(Wheel carWhell) {
        if (carWhell == null){
            System.out.println("Uncorrect parameter. Field size wasn't changed");
            return;
        }
        this.carWhell = carWhell;
    }

    public void setCarColor(Color carColor) {
        if (carColor  == null) {
            System.out.println("Uncorrect parameter. Field size wasn't changed");
            return;
        }
        this.carColor = carColor;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public Color getCarColor() {
        return carColor;
    }

    public Wheel getCarWhell() {
        return carWhell;
    }

    public abstract void carMove ();

    public abstract void changeWheel ();
}
