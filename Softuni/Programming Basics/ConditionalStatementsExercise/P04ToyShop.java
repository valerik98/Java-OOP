package ConditionalStatementsExercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Петя има магазин за детски играчки.
        // Тя получава голяма поръчка, която трябва да изпълни.
        // С парите, които ще спечели иска да отиде на екскурзия.
        //Цени на играчките:
        //· Пъзел - 2.60 лв.
        //· Говореща кукла - 3 лв.
        //· Плюшено мече - 4.10 лв.
        //· Миньон - 8.20 лв.
        //· Камионче - 2 лв.
        double puzzle = 2.60;
        double doll = 3;
        double bear = 4.10;
        double minion = 8.20;
        double truck = 2;
        //Вход
        //От конзолата се четат 6 реда:
        //1. Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2. Брой пъзели - цяло число в интервала [0… 1000]
        //3. Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4. Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5. Брой миньони - цяло число в интервала [0 … 1000]
        //6. Брой камиончета - цяло число в интервала [0 … 1000]
        double tripPrice = Double.parseDouble (scanner.nextLine());
        int puzzleCount= Integer.parseInt (scanner.nextLine());
        int dollCount = Integer.parseInt (scanner.nextLine());
        int bearCount = Integer.parseInt (scanner.nextLine());
        int minionCount = Integer.parseInt (scanner.nextLine());
        int truckCount = Integer.parseInt (scanner.nextLine());
        int totalToysCount = puzzleCount + dollCount + bearCount + minionCount + truckCount;
        double totalPrice = puzzleCount*puzzle + dollCount*doll + bearCount*bear + minionCount*minion +truckCount*truck;
        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        if (totalToysCount>=50){
            totalPrice *= 0.75;
        }
        // От спечелените пари Петя трябва да даде 10% за наема на магазина.
        totalPrice *= 0.9;
        double restMoney = Math.abs(totalPrice - tripPrice);
        // Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.
        //Изход
        //На конзолата се отпечатва:
        //· Ако парите са достатъчни се отпечатва:
        //o "Yes! {оставащите пари} lv left."
        if (totalPrice>=tripPrice){
            System.out.printf("Yes! %.2f lv left.",restMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",restMoney);
        }
        //· Ако парите НЕ са достатъчни се отпечатва:
        //o "Not enough money! {недостигащите пари} lv needed."
        //Резултатът трябва да се форматира до втория знак след десетичната запетая

    }
}
