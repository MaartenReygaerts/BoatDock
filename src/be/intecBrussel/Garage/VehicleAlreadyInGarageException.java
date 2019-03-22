package be.intecBrussel.Garage;

public class VehicleAlreadyInGarageException extends Exception{

    private static final long serialVersionUID = 6700128813826374329L;


    /**
     * Constructor.
     * @param message The message.
     */
    public VehicleAlreadyInGarageException(String message){
        super(message);
    }
}
