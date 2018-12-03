package State;

import Avto.InvalidParamException;

import java.util.Arrays;

public class State {
    private String name;
    private Area[] stateAreas;//Массив площадей в данном государстве
    private String capital;

    public State() {
    }

    public State(String name, Area[] stateAreas, String capital) throws InvalidParamException {
        if (name == null || name.isEmpty() || stateAreas == null || capital == null || capital.isEmpty()) {
            throw new InvalidParamException();
        }
        this.name = name;
        this.stateAreas = stateAreas;
        this.capital = capital;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Uncorrect parameter. Field name wasn't changed");
            return;
        }
        this.name = name;
    }

    public void setStateAreas(Area[] stateAreas) {
        if (stateAreas == null) {
            System.out.println("Uncorrect parameter. Field Area[] stateAreas wasn't changed");
            return;
        }
        this.stateAreas = stateAreas;
    }

    public void setCapital(String capital) {
        if (capital == null || capital.isEmpty()) {
            System.out.println("Uncorrect parameter. Field capital wasn't changed");
            return;
        }
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public Area[] getStateAreas() {
        return stateAreas;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "State - " + name + ", amount of areas - " + stateAreas.length +
                ", capital - " + capital + ".";
    }
}
