//Assignment 4 Exerciese2 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class CargoShip extends Ship {
    private String cargoType;
    private String loadingMethod;
    private int numberOfCranes;
    private boolean contraband;
    private double cargoValue;

    //structor
    public CargoShip(boolean floating, int capacity, double length, double width, String name, double height,
                     String origin, String departureDate, String arrivalDate, String departingPort, String arrivalPort, String owner,
                     String cargoType, String loadingMethod, int numberOfCranes, boolean contraband, double cargoValue) {
        super(floating, capacity, length, width, name, height, origin, departureDate, arrivalDate, departingPort, arrivalPort, owner);
        this.cargoType = cargoType;
        this.loadingMethod = loadingMethod;
        this.numberOfCranes = numberOfCranes;
        this.contraband = contraband;
        this.cargoValue = cargoValue;
    }

    //display method
    public void display() {
        super.display();
        System.out.println("Cargo Type: " + cargoType);
        System.out.println("Loading Method: " + loadingMethod);
        System.out.println("Number of Cranes: " + numberOfCranes);
        System.out.println("Contraband: " + contraband);
        System.out.println("Cargo Value: " + cargoValue);
    }
}
