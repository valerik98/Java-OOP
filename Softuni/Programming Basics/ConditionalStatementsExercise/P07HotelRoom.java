package ConditionalStatementsExercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt (scanner.nextLine());

        double studioPrice = 0;
        double apartamentPrice = 0;
        switch (month){
            case "May":
            case "October":
                studioPrice = 50 * countNights;
                apartamentPrice = 65 * countNights;
                if (countNights > 14){
                    studioPrice *= 0.70;
                } else if (countNights > 7) {
                    studioPrice *= 0.95;
                }

                break;
            case "June":
            case "September":
                studioPrice = 75.20 * countNights;
                apartamentPrice = 68.70 * countNights;
                if (countNights > 14) {
                    studioPrice *= 0.80;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76 * countNights;
                apartamentPrice = 77 * countNights;
                break;
        }
        if (countNights > 14){
            apartamentPrice *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartamentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
        //Изход
        //
        //Да се отпечатат на конзолата 2 реда:
        //
        //· На първия ред: "Apartment: {цена за целият престой} lv."
        //
        //· На втория ред: "Studio: {цена за целият престой} lv."
        //
        //Цената за целия престой форматирана с точност до два знака след десетичната запетая

    }
}
