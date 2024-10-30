package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());



        if (fuel.equals("Diesel")) {
            fuel = "diesel";
        } else if (fuel.equals("Gasoline")) {
            fuel = "gasoline";
        } else if (fuel.equals("Gas")) {
            fuel = "gas";
        } else {
            System.out.println("Invalid fuel!");
            System. exit(0);
            }
        if (liters >= 25) {
            System.out.printf("You have enough %s.", fuel);
        } else {
            System.out.printf("Fill your tank with %s!", fuel);
        }
    }
}
