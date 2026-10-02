public class FleetManager {

    private Vehicle[] vehicles;
    private int count;

    public FleetManager() {
        vehicles = new Vehicle[10]; // Maximum 10 vehicles
        count = 0;
    }

    // Add vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicles[count] = vehicle;
        count++;
    }

    // Display all vehicles
    public void displayVehicles() {

        System.out.println("\n========= VEHICLE LIST =========");

        for (int i = 0; i < count; i++) {
            vehicles[i].displayDetails();
            System.out.println("----------------------------");
        }
    }

    // Linear Search Algorithm
    public Vehicle searchVehicle(int id) {

        for (int i = 0; i < count; i++) {

            if (vehicles[i].getVehicleId() == id) {
                return vehicles[i];
            }
        }

        return null;
    }
}