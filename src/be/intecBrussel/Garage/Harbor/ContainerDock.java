package be.intecBrussel.Garage.Harbor;

import be.intecBrussel.Garage.Boat.ContainerBoat;

public class ContainerDock extends Dock {
    final int MAX;
    String country;
    ContainerBoat boat;

    public ContainerDock() {
        this.MAX = 80;
    }
    public ContainerDock(int max) {
        this.MAX = max;
    }

}
