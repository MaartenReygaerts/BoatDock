package be.intecBrussel.Garage.Harbor;

import be.intecBrussel.Garage.Boat.Boat;
import be.intecBrussel.Garage.Interfaces.Movable;

public abstract class Dock {

    final int MAX;
    String country;
    Movable vehicles;
    Boat dockedBoat;

    //constructors
    public Dock(){
        this.MAX = 80;
    }
    public Dock(String country,int max){
        this.country = country;
        this.MAX = max;
    }


}
