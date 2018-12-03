package State;

import Avto.InvalidParamException;

import java.util.Arrays;

public class District {
    private String name;
    private double square;//площадь в тыс. км квадратных
    private City[] districtCities;//Массив городов в данной облсати

    public District() {
    }

    public District(String name, double square, City[] districtCities) throws InvalidParamException {
        if (name == null || name.isEmpty() || square <= 0 || square > 7 || districtCities == null) {
            new InvalidParamException();
        }
        this.name = name;
        this.square = square;
        this.districtCities = districtCities;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Uncorrect parameter. Field name wasn't changed");
            return;
        }
        this.name = name;
    }

    public void setSquare(double square) {
        if (square <= 0 || square > 7) {
            System.out.println("Uncorrect parameter. Field square wasn't changed");
            return;
        }
        this.square = square;
    }

    public void setDistrictCities(City[] districtCities) {
        if (name == null) {
            System.out.println("Uncorrect parameter. Field City[] districtCities wasn't changed");
            return;
        }
        this.districtCities = districtCities;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public City[] getDistrictCities() {
        return districtCities;
    }

    @Override
    public String toString() {
        return "District - " + name + ", area = " + square + " thousand square km" +
                ", amount of cities - " + districtCities.length + ".";
    }
}
