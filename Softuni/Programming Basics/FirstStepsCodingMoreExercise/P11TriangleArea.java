package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P11TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Напишете програма, която чете от конзолата страна и височина на триъгълник и пресмята неговото лице.
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        // Използвайте формулата за лице на триъгълник: area = a * h / 2.
        double s = a * h / 2;
        // Форматирате изхода до втория знак след десетичната запетая.
        System.out.printf("%.2f",s);
    }
}
