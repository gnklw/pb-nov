package conditionalStatements;

import java.util.Scanner;

public class _01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int sumSeconds = firstTime + secondTime + thirdTime;

        int min = sumSeconds / 60;
        int sec = sumSeconds % 60;

        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }

        //System.out.printf("%d:%02d", min, sec);
    }
}
