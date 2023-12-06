package loops;

import java.util.Scanner;

public class _04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfJudges = Integer.parseInt(scanner.nextLine());

        double totalGrades = 0;
        double countGrades = 0;

        String input = scanner.nextLine();
        while (!"Finish".equals(input)) {
            double grades = 0;

            for (int i = 0; i < numOfJudges; i++) {
                ++countGrades;
                double grade = Double.parseDouble(scanner.nextLine());
                grades += grade;
            }

            System.out.printf("%s - %.2f.%n", input, grades / numOfJudges);

            totalGrades += grades;
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalGrades / countGrades);
    }
}
