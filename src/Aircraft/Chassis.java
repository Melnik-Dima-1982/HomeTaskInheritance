package Aircraft;

import Avto.InvalidParamException;

public class Chassis {
    private double size;//параметр в дюймах

    public Chassis() {
    }

    public Chassis(double size) throws InvalidParamException {
        if (size < 30 || size > 50) {
            throw new InvalidParamException();
        }
        this.size = size;
    }

    public void setSize(double size) {
        if (size < 30 || size > 50) {
            return;
        }
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Chassis {" + "size = " + size + '}';
    }
}
