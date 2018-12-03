package Planet;

import Avto.InvalidParamException;

public class Ocean {
    private String name;
    private double area;
    private double volume;

    public Ocean() {
    }

    public Ocean(String name, double area, double volume) throws InvalidParamException {
        if (name == null || name.isEmpty() || area <= 0 || area > 200 || volume <= 0 || volume > 710) {
            throw new InvalidParamException();
        }
        this.name = name;
        this.area = area;
        this.volume = volume;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Uncorrect parameter. Field name wasn't change.");
            return;
        }
        this.name = name;
    }

    public void setArea(double area) {
        if (area <= 0 || area > 200) {
            System.out.println("Uncorrect parameter. Field area wasn't change.");
            return;
        }
        this.area = area;
    }

    public void setVolume(double volume) {
        if (volume <= 0 || volume > 400) {
            System.out.println("Uncorrect parameter. Field area wasn't change.");
            return;
        }
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Ocean - " + name + ", area = " + area +
                " million square km, volume = " + volume + " cubic km.";
    }
}
