import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long bill = 0;
        int rem = n;
        int[] slabSize = {100, 100, 200};
        int[] rate = {5, 7, 10};
        for (int i = 0; i < 3 && rem > 0; i++) {
            int units = Math.min(rem, slabSize[i]);
            bill += (long) units * rate[i];
            rem -= units;
        }
        bill += (long) rem * 15;
        System.out.println(bill);
    }
}
