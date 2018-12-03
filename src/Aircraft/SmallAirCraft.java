package Aircraft;

import Avto.InvalidParamException;

public class SmallAirCraft extends Aircraft {
    private String name;

    public SmallAirCraft() {
    }

    public SmallAirCraft(int amountOfChassis,
                         Chassis chassis,
                         CraftEngine craftEngine,
                         Wing craftWing, String name) throws InvalidParamException {
        super(amountOfChassis, chassis, craftEngine, craftWing);
        if (name == null || name.isEmpty()) {
            throw new InvalidParamException();
        }
        this.name = name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Uncorrect parameter. Field name wasn't changed");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }

    @Override
    public String toString() {
        return "SmallAirCraft{" +
                "name='" + name + '\'' +
                '}';
    }
}
