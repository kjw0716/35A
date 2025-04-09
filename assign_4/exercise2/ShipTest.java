//Assignment 4 Exerciese2 Programmed by Jackie Wang email:junkaiwang0716@gmail.com
public class ShipTest {
    public static void main(String[] args) {
        // Create an array of Ship
        Ship[] ships = new Ship[3];

        ships[0] = new Ship(true, 1100, 240.3, 30.0, "Ship1", 30.0, "USA",
                            "2025/01/05", "2025/02/05", "New York", "Hong Kong", "owner1");

        ships[1] = new CargoShip(true, 2000, 300.0, 50.0, "Ship2", 35.0, "China",
                                 "2025/02/01", "2025/02/20", "San Jose", "Shanghai", "owner2",
                                 "Electronics", "Crane", 10, false, 5000000.0);

        String[] services = {"Pool", "buffet", "bathroom", "Gym"};
        ships[2] = new CruiseShip(true, 1500, 480.0, 45.0, "Ship3", 32.0, "USA",
        "2025/01/02", "2025/01/29", "Sydney", "San Francisco", "owner3",
        1500.0, 200, "Australian Menu", services, "Luxury");


        //deisplay the ship information
        for (int i = 0; i < ships.length; i++) {
            ships[i].display();
            System.out.println("------------------------------");
        }
    }
}
/*
Ship Name: Ship1
Floating: true
Capacity: 1100
Length: 240.3
Width: 30.0
Height: 30.0
Origin: USA
Departure Date: 2025/01/05
Arrival Date: 2025/02/05
Departing Port: New York
Arrival Port: Hong Kong
Owner: owner1
------------------------------
Ship Name: Ship2
Floating: true
Capacity: 2000
Length: 300.0
Width: 50.0
Height: 35.0
Origin: China
Departure Date: 2025/02/01
Arrival Date: 2025/02/20
Departing Port: San Jose
Arrival Port: Shanghai
Owner: owner2
Cargo Type: Electronics
Loading Method: Crane
Number of Cranes: 10
Contraband: false
Cargo Value: 5000000.0
------------------------------
Ship Name: Ship3
Floating: true
Capacity: 1500
Length: 480.0
Width: 45.0
Height: 32.0
Origin: USA
Departure Date: 2025/01/02
Arrival Date: 2025/01/29
Departing Port: Sydney
Arrival Port: San Francisco
Owner: owner3
Ticket Price: 1500.0
Number of Rooms: 200
Buffet Menu: Australian Menu
Services:
Pool
buffet
bathroom
Gym
Cruise Type: Luxury
 */