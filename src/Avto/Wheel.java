package Avto;

public class Wheel {
    private int size;
    private boolean isSteel;

    public Wheel() {
    }

    public Wheel(int size, boolean isSteel) throws InvalidParamException {
        if (size < 13 || size > 18) {
            throw new InvalidParamException();
        }
        this.size = size;
        this.isSteel = isSteel;
    }

    public void setSize(int size) {
        if (size < 13 || size > 18) {
            System.out.println("Uncorrect parameter. Field size wasn't changed");
            return;
        }
        this.size = size;
    }

    public void setSteel(boolean steel) {
        isSteel = steel;
    }

    public int getSize() {
        return size;
    }

    public boolean isSteel() {
        return isSteel;
    }

    public String takeMaterial (){
        if (isSteel == true){
            return "material - steel";
        } else {
            return "material - aluminum";
        }
    }

    @Override
    public String toString() {
        return "Wheel {" +  "size = " + size + ", " + takeMaterial() +
                "}.";
    }
}
