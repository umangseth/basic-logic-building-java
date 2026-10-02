import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long subtotal = 0;
        for (int i = 0; i < n; i++) {
            long price = sc.nextLong();
            long qty = sc.nextLong();
            subtotal += price * qty;
        }
        double rate;
        if (subtotal < 1000) rate = 0;
        else if (subtotal < 5000) rate = 0.05;
        else if (subtotal < 10000) rate = 0.10;
        else rate = 0.15;
        double discount = subtotal * rate;
        double after = subtotal - discount;
        double tax = after * 0.05;
        double finalAmount = after + tax;
        System.out.println(String.format("Subtotal: %.2f", (double) subtotal));
        System.out.println(String.format("Discount: %.2f", discount));
        System.out.println(String.format("Tax: %.2f", tax));
        System.out.println(String.format("Final Amount: %.2f", finalAmount));
    }
}
