package whileLoop;

import java.util.Scanner;

public class _05_Coins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        int changeInCoins = (int) (change * 100);
        int coinsCount = 0;

        while (changeInCoins > 0) {
            coinsCount++;
            if (changeInCoins >= 200) {
                changeInCoins -= 200;
            } else if (changeInCoins >= 100) {
                changeInCoins -= 100;
            } else if (changeInCoins >= 50) {
                changeInCoins -= 50;
            } else if (changeInCoins >= 20) {
                changeInCoins -= 20;
            } else if (changeInCoins >= 10) {
                changeInCoins -= 10;
            } else if (changeInCoins >= 5) {
                changeInCoins -= 5;
            } else if (changeInCoins >= 2) {
                changeInCoins -= 2;
            } else {
                changeInCoins -= 1;
            }
        }

        System.out.println(coinsCount);
    }
}
