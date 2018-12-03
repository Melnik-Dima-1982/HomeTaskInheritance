package Avto;

public class InvalidParamException extends  Exception {

    public InvalidParamException() {
    }

    public String getMessage(){
        return "Uncorrect parameter. ";
    }
}
