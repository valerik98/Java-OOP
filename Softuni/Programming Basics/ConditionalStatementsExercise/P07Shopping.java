package ConditionalStatementsExercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Петър иска да купи N видеокарти, M процесора и P на брой рам памет.
        //Вход
        //Входът се състои от четири реда:
        //1. Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        //2. Броят видеокарти - цяло число в интервала [0…100]
        //3. Броят процесори - цяло число в интервала [0…100]
        //4. Броят рам памет - цяло число в интервала [0…100]
        double budget = Double.parseDouble (scanner.nextLine());
        int videocardCount = Integer.parseInt (scanner.nextLine());
        int proccessorCount = Integer.parseInt (scanner.nextLine());
        int ramCount = Integer.parseInt (scanner.nextLine());
        // Важат следните цени:
        //· Видеокарта – 250 лв./бр.
        //· Процесор – 35% от цената на закупените видеокарти/бр.
        //· Рам памет – 10% от цената на закупените видеокарти/бр.
        //Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.
        int videocardPrice = 250*videocardCount;
        double proccessorPrice = (0.35*videocardPrice);
        double ramPrice = 0.10*videocardPrice;
        double totalPrice = videocardPrice+ proccessorPrice*proccessorCount + ramPrice*ramCount;
        // Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка.
        if (videocardCount>proccessorCount){
            totalPrice *=0.85;
        }
        double difference = Math.abs(budget-totalPrice);
        //Изход
        //На конзолата се отпечатва 1 ред, който трябва да изглежда по следния начин:
        //· Ако бюджета е достатъчен:
        //"You have {остатъчен бюджет} leva left!"
        if (budget>=totalPrice){
            System.out.printf("You have %.2f leva left!",difference);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",difference);
        }
        //· Ако сумата надхвърля бюджета:
        //"Not enough money! You need {нужна сума} leva more!"
        //Резултатът да се форматира до втория знак след десетичната запетая.
    }
}
