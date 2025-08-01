public class DiscountedProduct extends Product{
    private double discountRate;

    public DiscountedProduct(String name, double price, double discountRate) {
        super(name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double getFinalPrice() {
        return basePrice * (1 - discountRate);
    }
    @Override
    public String toString() {
        return "Discounted Product: " + productName + ", Final Price: $" + String.format("%.2f", getFinalPrice());
    }
}
