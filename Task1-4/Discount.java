import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double discountRate = 0.0;

        
        if (purchaseAmount < 500) {
            discountRate = 0.0;
        } else if (purchaseAmount <= 1000) {
            discountRate = 0.10; // 10% discount
        } else {
            discountRate = 0.20; // 20% discount
        }

        // Calculate final values
        double discountAmount = purchaseAmount * discountRate;
        double finalAmount = purchaseAmount - discountAmount;

        // Output the results
        System.out.println("Discount applied: " + (discountRate * 100) + "%");
        System.out.println("Discount amount: ₹" + discountAmount);
        System.out.println("Final payable amount: ₹" + finalAmount);

        scanner.close();
    }
}
