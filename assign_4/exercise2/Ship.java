//Assignment 4 Exerciese2 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class Ship {
    protected boolean floating;
    protected int capacity;
    protected double length;
    protected double width;
    protected String name;
    protected double height;
    protected String origin;
    protected String departureDate;
    protected String arrivalDate;
    protected String departingPort;
    protected String arrivalPort;
    protected String owner;

    //structor
    public Ship(boolean floating, int capacity, double length, double width, String name, double height,
                String origin, String departureDate, String arrivalDate, String departingPort, String arrivalPort, String owner) {
        this.floating = floating;
        this.capacity = capacity;
        this.length = length;
        this.width = width;
        this.name = name;
        this.height = height;
        this.origin = origin;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departingPort = departingPort;
        this.arrivalPort = arrivalPort;
        this.owner = owner;
    }

    //display method
    public void display() {
        System.out.println("Ship Name: " + name);
        System.out.println("Floating: " + floating);
        System.out.println("Capacity: " + capacity);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Origin: " + origin);
        System.out.println("Departure Date: " + departureDate);
        System.out.println("Arrival Date: " + arrivalDate);
        System.out.println("Departing Port: " + departingPort);
        System.out.println("Arrival Port: " + arrivalPort);
        System.out.println("Owner: " + owner);
    }
}
