package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P08FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double price = 0;
        if (fuel.equals("Gasoline")) {
            price = liters * 2.22;
            if (clubCard.equals("Yes")) {
                price = price - liters * 0.18;
            }
        } else if (fuel.equals("Diesel")) {
            price = liters * 2.33;
            if (clubCard.equals("Yes")) {
                price = price - liters * 0.12;
            }
        } else if (fuel.equals("Gas")) {
            price = liters * 0.93;
            if (clubCard.equals("Yes")) {
                price = price - liters * 0.08;
            }
        }
        if (liters >= 20 && liters <= 25) {
    price *= 0.92;
        } else if (liters >25) {
            price *=0.90;
        }
        System.out.printf("%.2f lv.",price);
    }
}
