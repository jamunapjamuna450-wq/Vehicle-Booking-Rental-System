public class Discount {

    // Returns discount percentage based on rental days
    public double getDiscount(int days) {

        if (days >= 7) {
            return 20;
        } else if (days >= 5) {
            return 15;
        } else if (days >= 3) {
            return 10;
        } else {
            return 0;
        }
    }

    // Calculates final amount after discount
    public double calculateFinalAmount(double amount, int days) {

        double discount = getDiscount(days);

        return amount - (amount * discount / 100);
    }
}