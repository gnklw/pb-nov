package loops;

import java.util.Scanner;

public class _01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;

        for (int row = 1; row <= n; row++) {

            for (int j = 1; j <= row; j++) {
                if (num > n) {
                    break;
                }

                System.out.print(num + " ");
                ++num;
            }

            if (num > n) {
                break;
            }

            System.out.println();
        }
    }
}
