package Planet;

import Avto.InvalidParamException;

public class Island {
    private String name;
    private double area;

    public Island() {
    }

    public Island(String name, double area) throws InvalidParamException {
        if (name == null || name.isEmpty() || area <= 0 || area > 2140000) {
            new InvalidParamException();
        }
        this.name = name;
        this.area = area;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Uncorrect parameter. Field name wasn't changed");
            return;
        }
        this.name = name;
    }

    public void setArea(double area) {
        if (area <= 0 || area > 2140000) {
            System.out.println("Uncorrect parameter. Field area wasn't change.");
            return;
        }
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Island - " + name + ", area = " +
                +area + " square km.";
    }
}
