import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0, failed = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            total += m;
            if (m < 40) failed++;
        }
        double avg = (double) total / n;
        System.out.println("Total: " + total);
        System.out.println(String.format("Average: %.2f", avg));
        System.out.println("Failed Subjects: " + failed);
        System.out.println("Result: " + (failed == 0 && avg >= 50 ? "PASS" : "FAIL"));
    }
}
