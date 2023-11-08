package conditionalStatements;

import java.util.Scanner;

public class _02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double points;

        if (num <= 100) {
            points = 5;
        } else if (num <= 1000) {
            points = (double) (num * 20) / 100;
        } else {
            points = (double) (num * 10) / 100;
        }

        if (num % 2 == 0) {
            points = points + 1;
        }

        if (num % 10 == 5) {
            points = points + 2;
        }

        System.out.println(points);
        System.out.println(num + points);
    }
}
