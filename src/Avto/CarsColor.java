package Avto;

public enum CarsColor {
    WHITE ("БЕЛЫЙ"),
    BLACK ("ЧЕРНЫЙ"),
    GREY ("СЕРЫЙ"),
    RED ("КРАСНЫЙ");

    private String colorName;

    CarsColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
