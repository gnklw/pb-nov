package forLoop;

import java.util.Scanner;

public class _07_TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        int totalPeople = 0;

        for (int i = 0; i < groups; i++) {
            int numOfPeople = Integer.parseInt(scanner.nextLine());
            totalPeople += numOfPeople;
            if (numOfPeople <= 5) {
                p1 += numOfPeople;
            } else if (numOfPeople <= 12) {
                p2 += numOfPeople;
            } else if (numOfPeople <= 25) {
                p3 += numOfPeople;
            } else if (numOfPeople <= 40) {
                p4 += numOfPeople;
            } else {
                p5 += numOfPeople;
            }
        }

        System.out.printf("%.2f%%%n", 100.0 * p1 / totalPeople);
        System.out.printf("%.2f%%%n", 100.0 * p2 / totalPeople);
        System.out.printf("%.2f%%%n", 100.0 * p3 / totalPeople);
        System.out.printf("%.2f%%%n", 100.0 * p4 / totalPeople);
        System.out.printf("%.2f%%%n", 100.0 * p5 / totalPeople);
    }
}
