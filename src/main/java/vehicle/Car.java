package vehicle;

import vehicle.behaviours.ICombust;
import vehicle.components.Engine;

public class Car extends Vehicle implements ICombust {
    public Car(String colour, double price, Engine engine) {
        super(colour, price, engine);
    }

    public String refuel(int percentage){
        return "Filling up " + percentage + "%.";
    }

}
