import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long balance = sc.nextLong();
        while (sc.hasNext()) {
            String op = sc.next().toUpperCase();
            if (op.equals("E")) {
                break;
            } else if (op.equals("B")) {
                System.out.println("Balance: " + balance);
            } else if (op.equals("D")) {
                long amt = sc.nextLong();
                balance += amt;
                System.out.println("Deposit Successful");
            } else if (op.equals("W")) {
                long amt = sc.nextLong();
                if (amt <= balance) {
                    balance -= amt;
                    System.out.println("Withdrawal Successful");
                } else {
                    System.out.println("Insufficient Balance");
                }
            }
        }
        System.out.println("Final Balance: " + balance);
    }
}
