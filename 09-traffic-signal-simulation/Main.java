import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long queue = 0, totalPassed = 0;
        for (int i = 1; i <= n; i++) {
            char signal = Character.toUpperCase(sc.next().charAt(0));
            long arriving = sc.nextLong();
            queue += arriving;
            long allowed = signal == 'G' ? 10 : signal == 'Y' ? 2 : 0;
            long passed = Math.min(queue, allowed);
            queue -= passed;
            totalPassed += passed;
            System.out.println("Cycle " + i + ": Passed = " + passed + ", Remaining = " + queue);
        }
        System.out.println("Total Passed: " + totalPassed);
        System.out.println("Final Queue: " + queue);
    }
}
