public class Truck extends Vehicle {

    public Truck(int id, String name, double rent) {
        super(id, name, rent);
    }

    @Override
    public void displayDetails() {
        System.out.println("\n----- Truck -----");
        super.displayDetails();
    }
}