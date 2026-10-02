import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double existingEmi = sc.nextDouble();
        int credit = sc.nextInt();
        double loan = sc.nextDouble();
        double annualRate = sc.nextDouble();
        int months = sc.nextInt();

        boolean eligible = salary >= 25000 && credit >= 700 && existingEmi <= 0.40 * salary;
        if (!eligible) {
            System.out.println("Loan Status: NOT ELIGIBLE");
            return;
        }
        double maxEmi = 0.5 * salary - existingEmi;
        double r = annualRate / 12 / 100;
        double pow = Math.pow(1 + r, months);
        double emi = loan * r * pow / (pow - 1);

        System.out.println("Loan Status: ELIGIBLE");
        System.out.println(String.format("Maximum EMI: %.2f", maxEmi));
        System.out.println(String.format("Estimated Monthly EMI: %.2f", emi));
        if (emi > maxEmi) {
            System.out.println("Requested loan amount cannot be approved under the EMI condition");
        }
    }
}
