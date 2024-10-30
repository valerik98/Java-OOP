package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P10TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете от конзолата три дробни числа b1, b2 и h
        // и пресмята лицето на трапец с основи b1 и b2 и височина h.
        // Формулата за лице на трапец е (b1 + b2) * h / 2.

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double s = (b1 + b2) * h / 2;

        //Отговорът трябва да е форматиран до втората цифра след десетичния знак.

        System.out.printf("%.2f",s);
    }
}
