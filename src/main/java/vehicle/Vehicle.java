package vehicle;

import vehicle.components.Engine;
import vehicle.components.Tyre;

import java.util.ArrayList;

public abstract class Vehicle {
    private String colour;
    private double price;
    private Engine engine;
    private ArrayList<Tyre> tyres;

    public Vehicle(String colour, double price, Engine engine){
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyres = new ArrayList<Tyre>();

    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public void addTyre(Tyre tyre){
        this.tyres.add(tyre);
    }
}
