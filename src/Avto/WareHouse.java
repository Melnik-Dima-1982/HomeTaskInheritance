package Avto;

public class WareHouse {
    private Engine[] massEngine;
    private Wheel[] massWhells;

    {
        try {
            massEngine = new Engine[]{
                    new Engine(1.2, 80, "disel"),
                    new Engine(2.0, 110, "disel"),
                    new Engine(1.4, 85, "gasoline"),
                    new Engine(1.8, 135, "gasoline"),
                    new Engine(1.5, 75, "gas"),
                    new Engine(2.5, 115, "gas")
            };

            massWhells = new Wheel[]{
                    new Wheel(13, true),
                    new Wheel(14, false),
                    new Wheel(15, false),
                    new Wheel(16, true),
                    new Wheel(17, true)
            };

        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }
    }

    public Engine takeEngine() {
        return massEngine[(int) (Math.random() * massEngine.length)];
    }

    public Wheel takeWheel() {
        return massWhells[(int) (Math.random() * massWhells.length)];
    }
}
