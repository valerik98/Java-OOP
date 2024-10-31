package WorkingWithAbstraction.Lab.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{pricePerDay} {numberOfDays} {season} {discountType}"

        String[] token = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(token[0]);
        int numberOfDays = Integer.parseInt(token[1]);
        Season season = Season.valueOf(token[2]);
        Discount discount = Discount.valueOf(token[3]);
        System.out.printf("%.2f", PriceCalculator.calculatePrice(pricePerDay, numberOfDays, season, discount));

    }
}
