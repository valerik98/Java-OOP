package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        double miles = Double.parseDouble (scanner.nextLine());
        double rate = 0;


        switch (season){
            case "Spring":
            case "Autumn":
                if (miles<=5000){
                    rate = 0.75;
                } else if (miles <= 10000) {
                    rate = 0.95;
                }
                break;
            case "Summer":
                if (miles<=5000){
                    rate = 0.90;
                } else if (miles <= 10000) {
                    rate = 1.10;
                }
                break;
            case "Winter":
                if (miles<=5000){
                    rate = 1.05;
                } else if (miles <= 10000) {
                    rate = 1.25;
                }
                break;
        }
    if (miles> 10000 && miles <= 20000){
        rate = 1.45;
    }
    double wage = (4*miles*rate)*0.9;
        System.out.printf("%.2f",wage);
    }
}
