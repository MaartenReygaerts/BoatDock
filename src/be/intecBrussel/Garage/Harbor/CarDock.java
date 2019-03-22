package be.intecBrussel.Garage.Harbor;

import be.intecBrussel.Garage.Boat.CarBoat;
import be.intecBrussel.Garage.Boat.CarZone;
import be.intecBrussel.Garage.Garage.Garage;
import be.intecBrussel.Garage.Interfaces.Movable;

public class CarDock extends Dock {
    final int MAX;
    String country;
    Movable[] vehicles;
    CarBoat boat;
    Garage dockGarage;
    CarZone[] dockParkeerZone;
    final int MAX_SPEED;

    //constructors
    public CarDock(){
    this.MAX_SPEED = 120;
    this.MAX = 80;
    }

    public CarDock(String country,int max, int maxspeed){
        this.country = country;
        this.MAX = max;
        this.MAX_SPEED = maxspeed;
    }




}
