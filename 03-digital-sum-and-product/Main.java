import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0, product = 1;
        while (n > 0) {
            int d = (int) (n % 10);
            sum += d;
            product *= d;
            n /= 10;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Divisible by 3: " + (sum % 3 == 0 ? "Yes" : "No"));
    }
}
