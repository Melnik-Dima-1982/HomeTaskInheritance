package Planet;

import Avto.InvalidParamException;

public class Planet {
    private String name;
    private Mainland[] mainlands;
    private Ocean[] oceans;
    private Island[] islands;

    public Planet() {
    }

    public Planet(String name, Mainland[] mainlands, Ocean[] oceans, Island[] islands) throws InvalidParamException {
        if (name == null || name.isEmpty() || mainlands == null || oceans == null || islands == null) {
            throw new InvalidParamException();
        }
        this.name = name;
        this.mainlands = mainlands;
        this.oceans = oceans;
        this.islands = islands;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Uncorrect parameter. Field name wasn't change.");
            return;
        }
        this.name = name;
    }

    public void setMainlands(Mainland[] mainlands) {
        if (mainlands == null) {
            System.out.println("Uncorrect parameter. Field mainlands wasn't change.");
            return;
        }
        this.mainlands = mainlands;
    }

    public void setOceans(Ocean[] oceans) {
        if (oceans == null) {
            System.out.println("Uncorrect parameter. Field oceans wasn't change.");
            return;
        }
        this.oceans = oceans;
    }

    public void setIslands(Island[] islands) {
        if (islands == null) {
            System.out.println("Uncorrect parameter. Field oceans wasn't change.");
            return;
        }
        this.islands = islands;
    }

    public String getName() {
        return name;
    }

    public Mainland[] getMainlands() {
        return mainlands;
    }

    public Ocean[] getOceans() {
        return oceans;
    }

    public Island[] getIslands() {
        return islands;
    }

    @Override
    public String toString() {
        return "Planet - " + name + ", amount of mainlands - " + mainlands.length +
                ", amount of oceans - " + oceans.length +
                ", amount of islands - " + islands.length;
    }
}
