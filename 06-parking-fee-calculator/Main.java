import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        for (int i = 0; i < n; i++) {
            char type = Character.toUpperCase(sc.next().charAt(0));
            int hours = sc.nextInt();
            int first, extra;
            switch (type) {
                case 'C': first = 30; extra = 20; break;
                case 'B': first = 15; extra = 10; break;
                default:  first = 50; extra = 40; break; // T
            }
            int firstHours = Math.min(hours, 2);
            total += (long) firstHours * first + (long) (hours - firstHours) * extra;
        }
        System.out.println("Total Collection: " + total);
    }
}
