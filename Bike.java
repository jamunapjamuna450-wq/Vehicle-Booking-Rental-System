public class Bike extends Vehicle {

    public Bike(int id, String name, double rent) {
        super(id, name, rent);
    }

    @Override
    public void displayDetails() {
        System.out.println("\n----- Bike -----");
        super.displayDetails();
    }
}