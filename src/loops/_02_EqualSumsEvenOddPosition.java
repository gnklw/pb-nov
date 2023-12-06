package loops;

import java.util.Scanner;

public class _02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            int currentNum = i;
            int sumOdd = 0;
            int sumEven = 0;

            for (int j = 6; j > 0; j--) {
                int lastDigit = currentNum % 10;
                currentNum /= 10;

                if (j % 2 == 0) {
                    sumEven += lastDigit;
                } else {
                    sumOdd += lastDigit;
                }
            }

            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
