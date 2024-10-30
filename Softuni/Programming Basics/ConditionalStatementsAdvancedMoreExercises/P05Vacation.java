package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double budget = Double.parseDouble (scanner.nextLine());
        String season = scanner.nextLine();

        if (budget<=1000){
            if (season.equals("Summer")){
                System.out.printf("Alaska - Camp - %.2f",0.65*budget);
            } else if (season.equals("Winter")) {
                System.out.printf("Morocco - Camp - %.2f",0.45*budget);
            }
        } else if (budget<=3000) {
            if (season.equals("Summer")){
                System.out.printf("Alaska - Hut - %.2f",0.80*budget);
            } else if (season.equals("Winter")) {
                System.out.printf("Morocco - Hut - %.2f",0.60*budget);
            }
        }else{
            if (season.equals("Summer")){
                System.out.printf("Alaska - Hotel - %.2f",0.90*budget);
            } else if (season.equals("Winter")) {
                System.out.printf("Morocco - Hotel - %.2f",0.90*budget);
            }
        }
    }
}
