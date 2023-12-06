package codeReview;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }
}

/*
 * Задача 4: Изчисляване на факториел
 * Напишете програма, която изчислява факториела на число, въведено от потребителя.
 */
