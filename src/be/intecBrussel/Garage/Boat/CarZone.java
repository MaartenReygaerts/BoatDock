package be.intecBrussel.Garage.Boat;

import be.intecBrussel.Garage.Garage.Car;

public class CarZone {
    int maxVehicle;
    String zoneId;
    Car[] cars;

    //constructors
    public CarZone(String zoneId, int maxVehicle) {
        this.zoneId = zoneId;
        this.maxVehicle = maxVehicle;
    }

    public int getMaxVehicle() {
        return maxVehicle;
    }

    public void setMaxVehicle(int maxVehicle) {
        this.maxVehicle = maxVehicle;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }
}
