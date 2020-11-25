package vehicle.components;

public class Tyre {
    private String type;
    private double diameter;

    public Tyre(String type, double diameter){
        this.type = type;
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public double getDiameter() {
        return diameter;
    }
}
