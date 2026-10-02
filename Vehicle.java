public class Vehicle {

    private int vehicleId;
    private String vehicleName;
    private double rentPerDay;
    private boolean available;

    public Vehicle(int vehicleId, String vehicleName, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.rentPerDay = rentPerDay;
        this.available = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Runtime Polymorphism
    public void displayDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Rent Per Day : ₹" + rentPerDay);
        System.out.println("Available : " + (available ? "Yes" : "No"));
    }
}