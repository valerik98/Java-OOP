package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Вход
        //От конзолата се четe 1 ред:
        //· Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]

        int annualFeeForBasketballPractice = Integer.parseInt(scanner.nextLine());

        // Нужна екипировка:
        //• Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double basketballSneakers = annualFeeForBasketballPractice - annualFeeForBasketballPractice*0.40;
        double basketballSuite = basketballSneakers - basketballSneakers*0.20;
        double basketBall = basketballSuite/4;
        double basketballAccessories = basketBall/5;

        //Изход
        //Да се отпечата на конзолата колко ще са разходите на Джеси, ако започне да спортува баскетбол.

        double totalExpenses = basketBall + basketballAccessories + basketballSneakers + basketballSuite + annualFeeForBasketballPractice;
        System.out.println(totalExpenses);
    }
}
