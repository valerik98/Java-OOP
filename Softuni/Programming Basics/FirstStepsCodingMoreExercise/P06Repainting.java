package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // · Предпазен найлон - 1.50 лв. за кв. метър
        //· Боя - 14.50 лв. за литър
        //· Разредител за боя - 5.00 лв. за литъ
        double nylonPerMeter = 1.50;
        double paintPerLiter = 14.50;
        double thinnerPerLiter = 5.00;

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int paintNeeded = Integer.parseInt(scanner.nextLine());
        int thinnerNeeded = Integer.parseInt(scanner.nextLine());
        int hoursForBuilders = Integer.parseInt(scanner.nextLine());

        // Румен иска да добави още 10% от количеството боя
        // 2 кв.м. найлон, разбира се и
        // 0.40 лв. за торбички.
        // Sum/Wage на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.

        double totalNylonPrice = (neededNylon + 2) * nylonPerMeter;
        double totalPaintPrice = (paintNeeded + (0.10 * paintNeeded)) * paintPerLiter;
        double totalThinnerPrice = thinnerNeeded * thinnerPerLiter;
        double totalPrice = totalPaintPrice + totalNylonPrice + totalThinnerPrice + 0.40;
        double buildersWagePerHour = totalPrice * 0.3;
        double totalExpenses = totalPrice + (buildersWagePerHour * hoursForBuilders);

        System.out.println(totalExpenses);

    }
}
