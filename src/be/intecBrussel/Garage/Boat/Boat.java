package be.intecBrussel.Garage.Boat;

import be.intecBrussel.Garage.Interfaces.Floatable;

public abstract class Boat implements Floatable {

    private int count;
    private String city;
    private int number;
    private String callSign;
    private double speed;

    //constructors
    public Boat() {
    }

    public Boat(String city, int number) {
        this.city = city;
        this.number = number;
    }


}
