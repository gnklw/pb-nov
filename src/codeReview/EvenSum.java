package codeReview;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}

/*
 * Задача 1: Сума на четни числа
 * Напишете програма, която изчислява сумата на всички четни числа от 1 до N, където N е въведено от потребителя.
 */