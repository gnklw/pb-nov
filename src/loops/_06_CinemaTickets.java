package loops;

import java.util.Scanner;

public class _06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int standard = 0;
        int students = 0;
        int kid = 0;

        String input = scanner.nextLine();
        while (!"Finish".equals(input)) {
            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());

            int seatsSold = 0;
            String ticketsType = scanner.nextLine();
            while (!"End".equals(ticketsType)) {
                ++seatsSold;
                switch (ticketsType) {
                    case "student":
                        ++students;
                        break;
                    case "standard":
                        ++standard;
                        break;
                    case "kid":
                        ++kid;
                        break;
                }

                if (seats == seatsSold) {
                    break;
                }

                ticketsType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, (double) seatsSold / seats * 100);
            input = scanner.nextLine();
        }

        int totalTickets = standard + students + kid;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (double) students / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", (double) standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", (double) kid / totalTickets * 100);
    }
}
