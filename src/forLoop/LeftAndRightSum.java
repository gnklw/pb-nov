package forLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        // Създаваме скенер за четене на входни данни от конзолата.
        Scanner scanner = new Scanner(System.in);

        // Четем следващият ред от входа и го преобразуваме в цяло число.
        // Това число представлява броят на числата, които ще бъдат въведени за всяка сума.
        int n = Integer.parseInt(scanner.nextLine());

        /*
         TODO: Спрямо условието: Първо се въвеждат числата за формирането на лявата сума,
            * съответно за дясната, след това.
         */

        // Инициализираме две променливи за да пазим сумите - за лявата и дясната сума.
        int leftSum = 0;
        int rightSum = 0;
        //int leftSum, rightSum = 0;

        // Пускаме цикъл, който ще се изпълни 2 * n пъти - по веднъж за всяко число, което ще четем.
        for (int i = 1; i <= 2 * n; i++) {
            // Ако i е по-малко или равно на n, добавяме числото към лявата сума.
            if (i <= n) {
                leftSum += Integer.parseInt(scanner.nextLine());
            }
            // В противен случай, добавяме числото към дясната сума.
            else {
                rightSum += Integer.parseInt(scanner.nextLine());
            }
        }

        // Сравняваме двете суми.
        if (leftSum == rightSum) {
            // Ако сумите са равни, печатаме съобщение за това.
            System.out.println("Yes, sum = " + leftSum);
        } else {
            // Ако сумите не са равни, изчисляваме и печатаме разликата между тях.
            int diff = Math.abs(rightSum - leftSum);
            System.out.println("No, diff = " + diff);
        }

        // TODO: Don't forget to debug!
    }
}
