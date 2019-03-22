package be.intecBrussel.Garage.Garage;

import be.intecBrussel.Garage.GarageFullException;
import be.intecBrussel.Garage.Interfaces.Movable;
import be.intecBrussel.Garage.VehicleAlreadyInGarageException;

import java.util.Arrays;

/**
 * The class represents a garage of vehicles.
 *  @author Jamie Goegebeur
 */
public class Garage {

    private static final int MAX = 100;

    public Movable[] vehicles = new Movable[MAX];

    private int counter = 0;

    /**
     * Adds a vehicle to the garage.
     *
     * @param vehicle The vehicle.
     * @throws be.intecBrussel.Garage.GarageFullException Failed to add because the garage is full.
     * @throws be.intecBrussel.Garage.VehicleAlreadyInGarageException  Failed to add the vehicle because it is already in the garage.
     */
    public void addVehicle(Movable vehicle) throws GarageFullException, VehicleAlreadyInGarageException {
        if(counter>MAX-1){
            throw new GarageFullException("De garage is volzet.");
        } else {
            if(isVehiclePresent(vehicle)){
                throw new VehicleAlreadyInGarageException("Het voertuig zit reeds in de garage.");
            } else {
                int freePosition = nextFreePosition();
                vehicles[freePosition] = vehicle;
                counter++;
            }
        }
    }

    private boolean isVehiclePresent(Movable vehicle){
        boolean found = false;
        for(int i=0;i<MAX && !found;i++){
            if(vehicles[i]!=null
                    && vehicles[i].hashCode()==vehicle.hashCode()
                    && vehicles[i].equals(vehicle)){
                found = true;
            }
        }
        return found;
    }

    private int nextFreePosition(){
        boolean freePositionFound = false;
        int freePosition = MAX;
        for(int i=0;i<MAX && !freePositionFound;i++){
            if(vehicles[i]==null){
                freePositionFound = true;
                freePosition = i;
            }
        }
        return freePosition;
    }

    /**
     * Removes the vehicle from the garage.
     *
     * @param vehicle The vehicle.
     */
    public void removeVehicle(Movable vehicle){
        for(int i=0;i<MAX;i++){
            if(vehicles[i]!=null
                    && vehicles[i].hashCode()==vehicle.hashCode()
                    && vehicles[i].equals(vehicle)){
                vehicles[i]=null;
                counter--;
            }
        }
    }

    /**
     * Gets the vehicle on the index.
     *
     * @param index The index.
     * @return The vehicle.
     */
    public Movable getVehicleElement(int index){
        return vehicles[index];
    }

    /** Clears the garage. */
    public void clear(){
        vehicles = new Movable[MAX];
        counter = 0;
    }

    /**
     * Get the size.
     *
     * @return The size.
     */
    public int getSize(){
        return counter;
    }

    @Override
    public String toString() {
        return "Garage [vehicles=" + Arrays.toString(vehicles) + ", counter="
                + counter + "]";
    }
    public void printGarage() {
        int count = 1;
        for (Movable v: vehicles) {
            if (v !=null) {
                System.out.print("| " + v.toString() + " |");
                if (count %8 == 0) {
                    System.out.println();
                }
                count++;
            }

        }
    }



}