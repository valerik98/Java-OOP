package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnoliaCounts = Integer.parseInt (scanner.nextLine());
        int zyumbyulCounts = Integer.parseInt (scanner.nextLine());
        int rosesCounts = Integer.parseInt (scanner.nextLine());
        int cactusCounts = Integer.parseInt (scanner.nextLine());
        double giftPrice = Double.parseDouble (scanner.nextLine());

        double totalSumWithTaxes = (3.25*magnoliaCounts+4*zyumbyulCounts+3.50*rosesCounts+8*cactusCounts)*0.95;
        double difference = Math.abs(totalSumWithTaxes-giftPrice);
        //Изход
        //На конзолата трябва да се отпечата един ред.
        //•	Ако парите СА стигнали: "She is left with {останали} leva." –
        // сумата трябва да е закръглена към по-малко цяло число (пр. 1.90 -> 1).
        if (totalSumWithTaxes>=giftPrice){
            System.out.printf("She is left with %.0f leva.",Math.floor(difference));
        } else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(difference));
        }
        //•	Ако парите НЕ достигат: "She will have to borrow {останали} leva." –
        // сумата трябва да е закръглена към по-голямо цяло число (пр. 1.10 -> 2).
    }
}
