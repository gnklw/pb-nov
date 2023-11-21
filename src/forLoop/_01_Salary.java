package forLoop;

import java.util.Scanner;

public class _01_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean isLostSalary = false;

        for (int i = 0; i < tabs; i++) {
            String site = scanner.nextLine();

            switch (site) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0) {
                isLostSalary = true;
                break;
            }
        }

        if (isLostSalary) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
