package good;

public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double amount) {
        return discount.applyDiscount(amount);
    }
}
