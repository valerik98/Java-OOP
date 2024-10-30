package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P12CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която чете градуси по скалата на Целзий (°C)
        double c = Double.parseDouble(scanner.nextLine());
        // и ги преобразува до градуси по скалата на Фаренхайт (°F).
        double f = c*1.8 + 32;
        // Форматирате изхода до втория знак след десетичната запетая.
        System.out.printf("%.2f",f);
    }
}
