import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
        System.out.println(n > 0 ? "Positive" : "Zero");
        System.out.println(n % 5 == 0 ? "Divisible by 5" : "Not Divisible by 5");
    }
}
