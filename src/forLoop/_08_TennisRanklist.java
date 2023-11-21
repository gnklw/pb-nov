package forLoop;

import java.util.Scanner;

public class _08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int victories = 0;

        for (int tournament = 0; tournament < tournaments; tournament++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    points += 2000;
                    ++victories;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d%n", startPoints + points);
        System.out.printf("Average points: %.0f%n", Math.floor((double) points / tournaments));
        System.out.printf("%.2f%%%n", ((double) victories / tournaments) * 100);
    }
}
