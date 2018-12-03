package Aircraft;

import Avto.InvalidParamException;

public class Wing {
    private double length;//параметры в метрах
    private double width;

    public Wing() {
    }

    public Wing(double length, double width) throws InvalidParamException {
        if (length <= 5 || length > 15 || width < 5 || width > 10) {
            new InvalidParamException();
        }
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        if (length <= 5 || length > 15) {
            System.out.println("Uncorrect parameter. Field length wasn't changed");
            return;
        }
        this.length = length;
    }

    public void setWidth(int width) {
        if (width < 5 || width > 10) {
            System.out.println("Uncorrect parameter. Field width wasn't changed");
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Wing {" +
                "length = " + length + ", width = " + width + " metres}";
    }
}
