package conditionalStatements;

import java.util.Scanner;

public class _03_Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min = min + 15;

        if (min >= 60) {
            min = min - 60;
            hour = hour + 1;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
