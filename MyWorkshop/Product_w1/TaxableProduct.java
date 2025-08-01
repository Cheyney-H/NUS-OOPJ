public class TaxableProduct extends Product {
    private double taxRate;

    public TaxableProduct(String name, double price, double taxRate) {
        super(name, price);
        this.taxRate = taxRate;
    }

    @Override
    public double getFinalPrice() {
        return basePrice *(1 + taxRate);
    }

    @Override
    public String toString() {
        return "Taxable Product: " + productName + ", Final Price: $" + String.format("%.2f", getFinalPrice());
    }
}
