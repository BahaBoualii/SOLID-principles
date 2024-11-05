package good;

public class VipDiscount implements Discount{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}
