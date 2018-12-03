package State;

import Avto.InvalidParamException;

public class City {
    private String name;
    private double amountOfPeople;//количество человек в сотнях

    public City() {
    }

    public City(String name, double amountOfPeople) throws InvalidParamException {
        if (name == null || name.isEmpty() || amountOfPeople <= 0 || amountOfPeople > 25000) {
            throw new InvalidParamException();
        }
        this.name = name;
        this.amountOfPeople = amountOfPeople;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            System.out.println("Uncorrect parameter. Field name wasn't changed");
            return;
        }
        this.name = name;
    }

    public void setAmountOfPeople(double amountOfPeople) {
        if (amountOfPeople <= 0 || amountOfPeople > 25000) {
            System.out.println("Uncorrect parameter. Field amountOfPeople wasn't changed");
            return;
        }
        this.amountOfPeople = amountOfPeople;
    }

    public String getName() {
        return name;
    }

    public double getAmountOfPeople() {
        return amountOfPeople;
    }

    @Override
    public String toString() {
        return "City - " + name +", " + amountOfPeople +
                " hundred people." ;
    }
}
