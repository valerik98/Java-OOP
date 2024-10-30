package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble (scanner.nextLine());
        String season = scanner.nextLine();

        if (budget<=100){
            System.out.println("Economy class");
            if (season.equals("Summer")){
                System.out.printf("Cabrio - %.2f",0.35*budget);
            }else if (season.equals("Winter")){
                System.out.printf("Jeep - %.2f",0.65*budget);
            }

        }else if (budget<=500){
            System.out.println("Compact class");
            if (season.equals("Summer")){
                System.out.printf("Cabrio - %.2f",0.45*budget);
            }else if (season.equals("Winter")){
                System.out.printf("Jeep - %.2f",0.80*budget);
            }
        }else {
            System.out.println("Luxury class");
            System.out.printf("Jeep - %.2f",0.90*budget);
        }





    }
}
