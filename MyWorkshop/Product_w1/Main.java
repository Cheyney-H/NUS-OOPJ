public class Main {
    public static void main(String[] args) {
        // Create one Product, one TaxableProduct, and one DiscountedProduct
        Product product = new Product("Book", 10.00);
        TaxableProduct taxableProduct = new TaxableProduct("Laptop", 1000.00, 0.07);
        DiscountedProduct discountedProduct = new DiscountedProduct("Pen", 1.00, 0.10);

        // Print their final prices and descriptions
        System.out.println(product.toString());
        System.out.println(taxableProduct.toString());
        System.out.println(discountedProduct.toString());
    }
}