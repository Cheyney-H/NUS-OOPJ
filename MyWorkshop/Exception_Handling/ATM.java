import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 500;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        try {
            if (withdrawalAmount > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        }

        scanner.close();
    }
}