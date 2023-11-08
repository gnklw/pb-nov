package conditionalStatements;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int cpus = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250;
        double cpusPrice = cpus * (videoCardsPrice * 35 / 100);
        double ramPrice = ram * (videoCardsPrice * 10 / 100);

        double price = videoCardsPrice + cpusPrice + ramPrice;

        if (videoCards > cpus) {
            price -= price * 15 / 100;
        }

        double diff = Math.abs(price - budget);

        if (price > budget) {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        } else {
            System.out.printf("You have %.2f leva left!", diff);
        }
    }
}
