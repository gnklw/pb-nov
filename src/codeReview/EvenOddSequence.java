package codeReview;

import java.util.Scanner;

public class EvenOddSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            for (int i = 0; i <= x; i += 2) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }
}

/*
 * Задача 3: Отпечатване на поредица
 * Напишете програма, която чете едно цяло число x от конзолата.
 * Ако числото е четно, отпечатайте всички четни числа от 0 до x. Ако е нечетно, отпечатайте всички нечетни числа от x до 1.
 */
