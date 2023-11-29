package whileLoop;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int freeSpace = w * l * h;

        int currentSpace = 0;

        String input = scanner.nextLine();
        while (!"Done".equals(input)) {
            int numOfBoxes = Integer.parseInt(input);
            currentSpace += numOfBoxes;

            if (currentSpace >= freeSpace) {
                break;
            }

            input = scanner.nextLine();
        }

        if (currentSpace >= freeSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", currentSpace - freeSpace);
        } else {
            System.out.printf("%d Cubic meters left.", freeSpace - currentSpace);
        }
    }
}
