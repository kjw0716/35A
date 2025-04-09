//Assignment 4 Exerciese2 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class CruiseShip extends Ship {
    private double ticketPrice;
    private int numberOfRooms;
    private String buffetMenu;
    private String[] services;
    private String cruiseType;

    //structor
    public CruiseShip(boolean floating, int capacity, double length, double width, String name, double height,
                      String origin, String departureDate, String arrivalDate, String departingPort, String arrivalPort, String owner,
                      double ticketPrice, int numberOfRooms, String buffetMenu, String[] services, String cruiseType) {
        super(floating, capacity, length, width, name, height, origin, departureDate, arrivalDate, departingPort, arrivalPort, owner);
        this.ticketPrice = ticketPrice;
        this.numberOfRooms = numberOfRooms;
        this.buffetMenu = buffetMenu;
        this.services = services;
        this.cruiseType = cruiseType;
    }

    //diswplay method
    public void display() {
        super.display();
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Buffet Menu: " + buffetMenu);
        System.out.println("Services: ");
        for (int i = 0; i < services.length; i++) {
            System.out.println(services[i]);
        }
        System.out.println("Cruise Type: " + cruiseType);
    }
}
