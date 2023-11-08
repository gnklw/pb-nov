package conditionalStatements;

import java.util.Scanner;

public class _06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(distance / 15) * 12.5;

        double finalTime = (secPerMeter * distance) + delay;

        if (record > finalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", finalTime - record);
        }
    }
}
