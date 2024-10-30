package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int countPeopleInGroup = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double transport = 0;

        if (category.equals("VIP")) {
            price = 499.99;
        } else if (category.equals("Normal")) {
            price = 249.99;
        }
        double totalPrice = price * countPeopleInGroup;

        if (countPeopleInGroup <= 4) {
            transport = 0.75 * budget;
        } else if (countPeopleInGroup <= 9) {
            transport = 0.60 * budget;
        } else if (countPeopleInGroup < 25) {
            transport = 0.50 * budget;
        } else if (countPeopleInGroup < 50) {
            transport = 0.40 * budget;
        } else {
            transport = 0.25 * budget;
        }
        double diff = Math.abs(budget - transport - totalPrice);
        if (budget >= (totalPrice + transport)) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
