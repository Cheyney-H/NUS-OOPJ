public class Product {
    String productName;
    double basePrice;

    public Product(String productName, double basePrice) {
        this.productName = productName;
        this.basePrice = basePrice;
    }

    public double getFinalPrice() {
        return basePrice;
    }

    @Override
    public String toString(){
        return "Product: " + productName + ", Price: $" + String.format("%.2f", getFinalPrice());
    }

}
