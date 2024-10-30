package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //• Пилешко меню – 10.35 лв.
        //• Меню с риба – 12.40 лв.
        //• Вегетарианско меню – 8.15 лв.

        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double vegetarianMenu = 8.15;

        //· Брой пилешки менюта – цяло число в интервала [0 … 99]
        //· Брой менюта с риба – цяло число в интервала [0 … 99]
        //· Брой вегетариански менюта – цяло число в интервала [0 … 99]

        int countChickenMenus = Integer.parseInt(scanner.nextLine());
        int countFishMenus = Integer.parseInt(scanner.nextLine());
        int countVegeterianMenus = Integer.parseInt(scanner.nextLine());

        //колко ще струва на група хора да си поръчат храна за вкъщи.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.

        double totalPriceWithoutDesertAndDelivery = countChickenMenus*chickenMenu + countFishMenus*fishMenu + countVegeterianMenus*vegetarianMenu;
        double totalPrice = totalPriceWithoutDesertAndDelivery + 0.2*totalPriceWithoutDesertAndDelivery + 2.50;

        // Да се отпечата на конзолата един ред: "{цена на поръчката}"

        System.out.println(totalPrice);
    }
}
