package State;

import Avto.InvalidParamException;

public class Area {
    private String name;
    private double amountOfSettlements;//количество насл.пунктов в тысячах
    private District[] areaDistrict; //массив районов в данной области

    public Area() {
    }

    public Area(String name, double amountOfSettlements, District[] areaDistrict) throws InvalidParamException {
        if (name == null || name.isEmpty() || amountOfSettlements <= 0 || amountOfSettlements > 30 || areaDistrict == null) {
            new InvalidParamException();
        }
        this.name = name;
        this.amountOfSettlements = amountOfSettlements;
        this.areaDistrict = areaDistrict;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Uncorrect parameter. Field name wasn't changed");
            return;
        }
        this.name = name;
    }

    public void setAmountOfSettlements(double amountOfSettlements) {
        if (amountOfSettlements <= 0 || amountOfSettlements > 30) {
            System.out.println("Uncorrect parameter. Field amountOfSettlements wasn't changed");
            return;
        }
        this.amountOfSettlements = amountOfSettlements;
    }

    public void setAreaDistrict(District[] areaDistrict) {
        if (areaDistrict == null) {
            System.out.println("Uncorrect parameter. Field areaDistrict wasn't changed");
            return;
        }
        this.areaDistrict = areaDistrict;
    }

    public String getName() {
        return name;
    }

    public double getAmountOfSettlements() {
        return amountOfSettlements;
    }

    public District[] getAreaDistrict() {
        return areaDistrict;
    }

    @Override
    public String toString() {
        return "Area - " + name + ", amount of settlements - " + amountOfSettlements +
                ", amount of districts - " + areaDistrict.length + ".";
    }
}
