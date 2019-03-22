package be.intecBrussel.Garage;

public class GarageFullException extends Exception{

    private static final long serialVersionUID = -7520280918157414421L;

    /**
     * Constructor.
     * @param message The message.
     */
    public GarageFullException(String message){
        super(message);
    }
}