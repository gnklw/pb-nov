package whileLoop;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();

        int bookCount = 0;

        String input = scanner.nextLine();
        while (!"No More Books".equals(input)) {
            if (bookName.equals(input)) {
                break;
            }

            ++bookCount;
            input = scanner.nextLine();
        }


        if (bookName.equals(input)) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
