package ConditionalStatementsAdvancedExercises;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int degrees = Integer.parseInt (scanner.nextLine());
        String dayTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        switch (dayTime){
            case "Morning":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (18 < degrees && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                System.out.printf("It's %d degrees, get your %s and %s.",degrees ,outfit ,shoes);
                break;
            case "Afternoon":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (18 < degrees && degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degrees >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                System.out.printf("It's %d degrees, get your %s and %s.",degrees ,outfit ,shoes);
                break;
            case "Evening":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (18 < degrees && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                System.out.printf("It's %d degrees, get your %s and %s.",degrees ,outfit ,shoes);
                break;

        }
    }
    //Да се отпечата на конзолата на един ред: "It's {градуси} degrees, get your {облекло} and {обувки}.
}
