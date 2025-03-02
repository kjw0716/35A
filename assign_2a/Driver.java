//assign 2a progammed by Jackie Wang email:junkaiwang0716@gmail.com
import java.util.Scanner;

public class Driver {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Driver d1 = new Driver();
        
        Person Stacey = d1.readValue();
        Stacey.print();
        Person Ross = d1.readValue();
        Ross.print();
        Person Mia = d1.readValue();
        Mia.print();
    }

    public Person readValue() {
        System.out.print("Enter user name:");
        String name = in.nextLine();

        System.out.print("Enter user address:");
        String address = in.nextLine();

        System.out.print("Enter user age:");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Enter user phone number:");
        String phone = in.nextLine();

        return new Person(name, address, age, phone);
    }
}
/*
Enter user name:Stacey
Enter user address:101 apple ave
Enter user age:25
Enter user phone number:38478459

Name: Stacey
Address: 101 apple ave
Age: 25
Phone Number: 38478459

Enter user name:Ross
Enter user address:404 west blvd
Enter user age:49
Enter user phone number:98374556

Name: Ross
Address: 404 west blvd
Age: 49
Phone Number: 98374556

Enter user name:Mia
Enter user address:666 Jason ave
Enter user age:73 
Enter user phone number:947498588

Name: Mia
Address: 666 Jason ave
Age: 73
Phone Number: 947498588

 */