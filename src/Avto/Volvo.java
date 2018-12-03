package Avto;

import java.awt.*;

public class Volvo extends Car {
    private VolvoModels model;

    public Volvo() {

    }

    public Volvo(Engine carEngine, Wheel carWhell, Color carColor, VolvoModels model) throws InvalidParamException {
        super(carEngine, carWhell, carColor);
        if (model == null){
            throw new InvalidParamException();
        }
        this.model = model;
    }

    public void carMove() {
        System.out.println(model + " is moving");
    }

    public void changeWheel (){
        System.out.println(model + " needs to change wheel.");
    }
}
