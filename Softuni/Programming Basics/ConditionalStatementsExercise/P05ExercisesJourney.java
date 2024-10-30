package ConditionalStatementsExercise;

import java.util.Scanner;

public class P05ExercisesJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double budget = Double.parseDouble (scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String vacationKind = "";
        double restMoney = 0;
        double endPrice = 0;
        switch (season){
            case "summer":
                vacationKind = "Camp";
                if (budget<=100){
                    destination = "Bulgaria";
                    endPrice = budget * 0.30;
                } else if (budget<=1000) {
                    destination = "Balkans";
                    endPrice = budget * 0.40;
                } else {
                    destination = "Europe";
                    endPrice = budget * 0.90;
                }
                if (destination.equals("Europe")){
                    vacationKind = "Hotel";
                }
                break;
            case "winter":
                vacationKind = "Hotel";
                if (budget<=100){
                    destination = "Bulgaria";
                    endPrice = budget * 0.70;
                } else if (budget<=1000) {
                    destination = "Balkans";
                    endPrice = budget * 0.80;
                } else {
                    destination = "Europe";
                    endPrice = budget * 0.90;
                }
                break;
        }
        double diff = Math.abs(budget-endPrice);
        //Изход
        //На конзолата трябва да се отпечатат два реда.
        //· Първи ред – "Somewhere in {дестинация}" измежду "Bulgaria", "Balkans" и "Europe"
        //· Втори ред – "{Вид почивка} – {Похарчена сума}"
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",vacationKind,endPrice);
    }
}
