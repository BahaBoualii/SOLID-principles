package bad;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equalsIgnoreCase("Regular")) {
            return amount * 0.1;
        } else if (customerType.equalsIgnoreCase("VIP")) {
            return amount * 0.2;
        }
        return 0;
    }
}
