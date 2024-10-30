package ConditionalStatementsExercise;

import java.util.Scanner;

public class P05GodzillaVsKingKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budget = Double.parseDouble (scanner.nextLine());
        int statistCount = Integer.parseInt (scanner.nextLine());
        double statistClothesPriceForOnePerson = Double.parseDouble (scanner.nextLine());
        double statistClothesPrice = statistClothesPriceForOnePerson*statistCount;

        double decor = budget*0.1;
        if (statistCount>150){
            statistClothesPrice*=0.9;
        }
        double expenses = decor+statistClothesPrice;
        double restMoney = Math.abs(budget-expenses);
        if (expenses>budget){
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",restMoney);
        }else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.",restMoney);
        }
    }
}
