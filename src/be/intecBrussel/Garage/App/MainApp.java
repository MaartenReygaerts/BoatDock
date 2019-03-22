package be.intecBrussel.Garage.App;

import be.intecBrussel.Garage.Garage.Car;
import be.intecBrussel.Garage.Enums.Color;
import be.intecBrussel.Garage.Garage.Garage;
import be.intecBrussel.Garage.GarageFullException;
import be.intecBrussel.Garage.Garage.ProtoGarage;
import be.intecBrussel.Garage.VehicleAlreadyInGarageException;


public class MainApp {
    public static void main(String[] args) {

        ProtoGarage secret = new ProtoGarage();
        System.out.println("--------------------------------");
        System.out.println("    10 protoype cars");
        System.out.println("--------------------------------");
        secret.protoCars(10);
        secret.printGarage();
        System.out.println();
        System.out.println(secret.vehicles[0].toString());
    }

}