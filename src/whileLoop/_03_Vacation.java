package whileLoop;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int spendCount = 0;
        int days = 0;

        while (availableMoney < excursionPrice && spendCount != 5) {
            ++days;
            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "spend":
                    availableMoney -= amount;
                    spendCount++;

                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }

                    break;
                case "save":
                    availableMoney += amount;
                    spendCount = 0;
                    break;
            }
        }

        if (spendCount == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
