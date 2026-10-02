public class Car extends Vehicle {

    public Car(int id, String name, double rent) {
        super(id, name, rent);
    }

    @Override
    public void displayDetails() {
        System.out.println("\n----- Car -----");
        super.displayDetails();
    }
}