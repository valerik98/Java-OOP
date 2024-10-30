package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P05SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double penPrice = 5.80;
        double highlightersPrice = 7.20;
        double cleaner = 1.20;

        int penPackages = Integer.parseInt(scanner.nextLine());
        int highlightersPackages = Integer.parseInt(scanner.nextLine());
        int litersCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalPenPrice = penPackages*penPrice;
        double totalHighlighttersPrice = highlightersPrice*highlightersPackages;
        double totalCleanerPrice = litersCleaner*cleaner;

        double totalPriceWithoutDiscount = totalCleanerPrice + totalHighlighttersPrice + totalPenPrice;
        double totalPrice = totalPriceWithoutDiscount - (totalPriceWithoutDiscount*discount/100);

        System.out.println(totalPrice);


    }
}
