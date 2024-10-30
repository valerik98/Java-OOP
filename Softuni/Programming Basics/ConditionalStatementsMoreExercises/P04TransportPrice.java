package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nKilometers = Integer.parseInt (scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double amount = 0;
        double taxiAmountDay = 0.79*nKilometers+0.70;
        double taxiAmountNight = 0.90*nKilometers+0.70;
        double busAmount = 0.09*nKilometers;
        double trainAmount = 0.06*nKilometers;

        if (nKilometers<20 && dayOrNight.equals("day")){
            amount = 0.79*nKilometers+0.70;
        } else if (nKilometers<20 && dayOrNight.equals("night")){
            amount = 0.90*nKilometers+0.70;
        } else if (nKilometers>=20 && nKilometers<100){
            amount = 0.09*nKilometers;
        } else if (nKilometers>=100){
            amount = 0.06*nKilometers;
        }
        System.out.printf("%.2f",amount);
        //Напишете програма, която въвежда броя километри n и
        //период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.
        //Изход
        //Да се отпечата на конзолата най-ниската цена за посочения брой километри,
        //форматирана до втория знак след десетичния разделител.
    }
}
