import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wins = 0, losses = 0, ties = 0, points = 0, totalRuns = 0, highest = 0;
        for (int i = 0; i < n; i++) {
            int team = sc.nextInt();
            int opp = sc.nextInt();
            if (team > opp) { wins++; points += 2; }
            else if (team < opp) { losses++; }
            else { ties++; points += 1; }
            totalRuns += team;
            highest = Math.max(highest, team);
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
        System.out.println("Points: " + points);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Highest Score: " + highest);
    }
}
