package forLoop;

import java.util.Scanner;

public class _03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        for (int iteration = 0; iteration < n; iteration++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                ++p1;
            } else if (num < 400) {
                ++p2;
            } else if (num < 600) {
                ++p3;
            } else if (num < 800) {
                ++p4;
            } else {
                ++p5;
            }
        }

        System.out.printf("%.2f%%%n", (double) p1 / n * 100);
        System.out.printf("%.2f%%%n", (double) p2 / n * 100);
        System.out.printf("%.2f%%%n", (double) p3 / n * 100);
        System.out.printf("%.2f%%%n", (double) p4 / n * 100);
        System.out.printf("%.2f%%%n", (double) p5 / n * 100);
    }
}


/*
TODO: Само с масив стана...
import java.util.Scanner;

public class _03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] counts = new int[5]; // Масив с 5 елемента за p1, p2, p3, p4 и p5

        for (int iteration = 0; iteration < n; iteration++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                ++counts[0];
            } else if (num < 400) {
                ++counts[1];
            } else if (num < 600) {
                ++counts[2];
            } else if (num < 800) {
                ++counts[3];
            } else {
                ++counts[4];
            }
        }

        for (int count : counts) {
            System.out.printf("%.2f%%%n", (double) count / n * 100);
        }
    }
}
 */