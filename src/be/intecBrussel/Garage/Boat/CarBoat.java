package be.intecBrussel.Garage.Boat;

import be.intecBrussel.Garage.Garage.Car;

public class CarBoat extends Boat{
    int count;
    int maxVehicle;
    int maxLoad;
    Car[] car;

    //constructors
    public CarBoat() {
    }

    public CarBoat(int maxLoad, int maxVehicle) {
        this.maxLoad = maxLoad;
        this.maxVehicle = maxVehicle;
    }


    public int getMaxVehicle() {
        return maxVehicle;
    }

    public void setMaxVehicle(int maxVehicle) {
        this.maxVehicle = maxVehicle;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    //implement methods
    @Override
    public void Float() {

    }

    @Override
    public void Dock() {

    }

    @Override
    public void accelerate(double value) {

    }

    @Override
    public void slowDown(double value) {

    }

    @Override
    public double getSpeed() {
        return 0;
    }
}
