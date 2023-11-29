package whileLoop;

import java.util.Scanner;

public class _02_ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());

        int poorGrades = 0;
        int grades = 0;
        int tasks = 0;
        String lastTaskName = "";

        String input = scanner.nextLine();
        while (!"Enough".equals(input)) {
            tasks++;
            int grade = Integer.parseInt(scanner.nextLine());
            grades += grade;
            lastTaskName = input;

            if (grade <= 4) {
                poorGrades++;
            }

            if (poorGrades == maxPoorGrades) {
                break;
            }

            input = scanner.nextLine();
        }

        if (poorGrades == maxPoorGrades) {
            System.out.printf("You need a break, %d poor grades.%n", poorGrades);
        } else {
            System.out.printf("Average score: %.2f%n", (double) grades / tasks);
            System.out.printf("Number of problems: %d%n", tasks);
            System.out.printf("Last problem: %s%n", lastTaskName);
        }
    }
}
