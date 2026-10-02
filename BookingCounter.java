import java.util.Scanner;

public class BookingCounter {

    private FleetManager fleetManager;
    private Scanner sc;

    public BookingCounter(FleetManager fleetManager) {
        this.fleetManager = fleetManager;
        sc = new Scanner(System.in);
    }

    public void bookVehicle() {

        System.out.print("\nEnter Vehicle ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        Vehicle vehicle = fleetManager.searchVehicle(id);

        if (vehicle == null) {

            System.out.println("Vehicle Not Found!");
            return;
        }

        if (!vehicle.isAvailable()) {

            System.out.println("Vehicle Already Booked!");
            return;
        }

        System.out.print("Enter Customer Name : ");
        String customer = sc.nextLine();

        System.out.print("Enter Rental Days : ");
        int days = sc.nextInt();

        Booking booking = new Booking(customer, vehicle, days);

        System.out.println("\nBooking Successful!");

        booking.displayBooking();
    }
}