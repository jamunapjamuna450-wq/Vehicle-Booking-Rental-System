public class Booking {

    private String customerName;
    private Vehicle vehicle;
    private int rentalDays;
    private double totalAmount;

    public Booking(String customerName, Vehicle vehicle, int rentalDays) {

        this.customerName = customerName;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;

        double amount = vehicle.getRentPerDay() * rentalDays;

        Discount discount = new Discount();
        totalAmount = discount.calculateFinalAmount(amount, rentalDays);

        vehicle.setAvailable(false);
    }

    public void displayBooking() {

        System.out.println("\n========= BOOKING DETAILS =========");

        System.out.println("Customer Name : " + customerName);
        System.out.println("Vehicle ID    : " + vehicle.getVehicleId());
        System.out.println("Vehicle Name  : " + vehicle.getVehicleName());
        System.out.println("Rental Days   : " + rentalDays);

        double original = vehicle.getRentPerDay() * rentalDays;

        Discount discount = new Discount();

        System.out.println("Original Amount : ₹" + original);
        System.out.println("Discount        : "
                + discount.getDiscount(rentalDays) + "%");
        System.out.println("Final Amount    : ₹" + totalAmount);

        System.out.println("Booking Status  : Confirmed");
        System.out.println("===================================");
    }
}