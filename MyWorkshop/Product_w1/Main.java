import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter base price: ");
        double basePrice = sc.nextDouble();

        System.out.println("Select product type:");
        System.out.println("1. Regular Product");
        System.out.println("2. Taxable Product");
        System.out.println("3. Discounted Product");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        Product product = null;

        switch (choice) {
            case 1:
                product = new Product(productName, basePrice);
                break;
            case 2:
                System.out.print("Enter tax rate (e.g., 0.07 for 7%): ");
                double taxRate = sc.nextDouble();
                product = new TaxableProduct(productName, basePrice, taxRate);
                break;
            case 3:
                System.out.print("Enter discount rate (e.g., 0.10 for 10%): ");
                double discountRate = sc.nextDouble();
                product = new DiscountedProduct(productName, basePrice, discountRate);
                break;
            default:
                System.out.println("Invalid choice. Creating regular product.");
                product = new Product(productName, basePrice);
        }

        System.out.println(product.toString());
        sc.close();
/*
        Product product = new Product("Book", 10.00);
        TaxableProduct taxableProduct = new TaxableProduct("Laptop", 1000.00, 0.07);
        DiscountedProduct discountedProduct = new DiscountedProduct("Pen", 1.00, 0.10);

        System.out.println(product.toString());
        System.out.println(taxableProduct.toString());
        System.out.println(discountedProduct.toString());
*/
    }
}