package ConditionalStatementsAdvancedExercises;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int budget = Integer.parseInt (scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCounts = Integer.parseInt (scanner.nextLine());
        double shipPrice = 0;
        switch (season){
            case "Spring":
                shipPrice = 3000;
                break;
            case "Summer":
                shipPrice = 4200;
                break;
            case "Autumn":
                shipPrice = 4200;
                break;
            case "Winter":
                shipPrice = 2600;
                break;
        }
        if (fishermanCounts <= 6){
            shipPrice *= 0.9;
        } else if (fishermanCounts > 6 && fishermanCounts <= 11) {
            shipPrice *= 0.85;
        } else {
            shipPrice *= 0.75;
        }
        if (fishermanCounts % 2 == 0 && !season.equals("Autumn")){
            shipPrice *= 0.95;
        }

        //Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.
        double diff = Math.abs(budget-shipPrice);
        if (budget >= shipPrice){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }

    }
}
