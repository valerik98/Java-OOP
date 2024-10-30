package ForLoopMoreExercies;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        int countTroiki = 0;
        int countChitvorki = 0;
        int countPetici = 0;
        int countShistici = 0;
        double avgGradeCounter = 0;
        for (int i = 1; i <= countStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 3) {
                avgGradeCounter += grade;
                countTroiki++;
            } else if (grade < 4) {
                avgGradeCounter += grade;
                countChitvorki++;
            } else if (grade < 5) {
                avgGradeCounter += grade;
                countPetici++;
            } else {
                avgGradeCounter += grade;
                countShistici++;
            }
        }
        double avgGrade = avgGradeCounter / countStudents;

        double troikiPercent = 1.0 * countTroiki / countStudents * 100;
        double chitworkiPercent = 1.0 * countChitvorki / countStudents * 100;
        double peticiPercent = 1.0 * countPetici / countStudents * 100;
        double shisticiPercent = 1.0 * countShistici / countStudents * 100;

        System.out.printf("Top students: %.2f%%%n", shisticiPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", peticiPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", chitworkiPercent);
        System.out.printf("Fail: %.2f%%%n", troikiPercent);
        System.out.printf("Average: %.2f", avgGrade);
    }
}
