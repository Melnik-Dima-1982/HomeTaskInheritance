package Planet;

import Avto.InvalidParamException;

public class Mainland {
    private String name;
    private double square;

    public Mainland() {
    }

    public Mainland(String name, double square) throws InvalidParamException {
        if (name == null || name.isEmpty() || square <= 0 || square > 31) {
            throw new InvalidParamException();
        }
        this.name = name;
        this.square = square;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Uncorrect parameter. Field name wasn't change.");
            return;
        }
        this.name = name;
    }

    public void setSquare(double square) {
        if (square <= 0 || square > 31) {
            System.out.println("Uncorrect parameter. Field square wasn't change.");
            return;
        }
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Mainland - " + name +
                ", area = " + square + " million square km.";
    }
}
