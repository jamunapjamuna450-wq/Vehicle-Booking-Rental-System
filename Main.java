import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Fleet Manager
        FleetManager fleetManager = new FleetManager();

        // Add Vehicles
        fleetManager.addVehicle(new Car(101, "Maruti Swift", 1200));
        fleetManager.addVehicle(new Car(102, "Hyundai i20", 1500));

        fleetManager.addVehicle(new Bike(201, "Royal Enfield", 700));
        fleetManager.addVehicle(new Bike(202, "Yamaha R15", 800));

        fleetManager.addVehicle(new Truck(301, "Tata Truck", 2500));
        fleetManager.addVehicle(new Truck(302, "Ashok Leyland", 3000));

        // Booking Counter
        BookingCounter bookingCounter = new BookingCounter(fleetManager);

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println("   VEHICLE RENTAL BOOKING SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Display Vehicles");
            System.out.println("2. Search Vehicle");
            System.out.println("3. Book Vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    fleetManager.displayVehicles();
                    break;

                case 2:

                    System.out.print("Enter Vehicle ID: ");
                    int id = sc.nextInt();

                    Vehicle vehicle = fleetManager.searchVehicle(id);

                    if (vehicle != null) {
                        vehicle.displayDetails();
                    } else {
                        System.out.println("Vehicle Not Found.");
                    }

                    break;

                case 3:
                    bookingCounter.bookVehicle();
                    break;

                case 4:
                    System.out.println("Thank you for using Vehicle Rental System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}