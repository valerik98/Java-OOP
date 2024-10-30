package ConditionalStatementsAdvancedExercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //От конзолата се четат 3 реда:
        //· Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //· Брой цветя - цяло число в интервала [10…1000]
        //· Бюджет - цяло число в интервала [50…2500]
        String flowersType = scanner.nextLine();
        int flowersCount = Integer.parseInt (scanner.nextLine());
        int budget = Integer.parseInt (scanner.nextLine());
        double endPrice = 0;
        //Съществуват следните отстъпки:
        switch (flowersType){

            case "Roses":
                endPrice = flowersCount * 5;
                if (flowersCount>80){
                    endPrice = endPrice * 0.9;
                }
                break;

            case "Dahlias":
                endPrice = flowersCount * 3.80;
                if (flowersCount>90){
                    endPrice = endPrice * 0.85;
                }
                break;

            case "Tulips":
                endPrice = flowersCount * 2.80;
                if (flowersCount > 80) {
                    endPrice = endPrice * 0.85;
                }
                break;

            case "Narcissus":
                endPrice = flowersCount * 3;
                if (flowersCount < 120) {
                    endPrice = endPrice * 1.15;
                }
                break;

            case "Gladiolus":
                endPrice = flowersCount * 2.5;
                if (flowersCount < 80) {
                    endPrice = endPrice * 1.2;
                }
                break;

        }
        double diff = Math.abs(budget - endPrice);
        if (budget >= endPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowersCount, flowersType, diff);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }
        //Да се отпечата на конзолата на един ред:
        //· Ако бюджета им е достатъчен -
        //· Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
        //Сумата да бъде форматирана до втория знак след десетичната запетая.
    }
}
