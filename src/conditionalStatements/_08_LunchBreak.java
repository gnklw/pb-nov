package conditionalStatements;

import java.util.Scanner;

public class _08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double restOfBrake = durationBreak - ((durationBreak / 8.0) + (durationBreak / 4.0));

        double diff = Math.ceil(Math.abs(restOfBrake - durationEpisode));

        if (restOfBrake >= durationEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    seriesName, diff);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    seriesName, diff);
        }
    }
}