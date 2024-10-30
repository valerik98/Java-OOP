package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hranaZaKu4eta = 2.50;
        double hranaZaKotki = 4;
        int broihranaZaKu4eta = Integer.parseInt(scanner.nextLine());
        int broihranaZaKotki = Integer.parseInt(scanner.nextLine());
        double Sum = (hranaZaKu4eta * broihranaZaKu4eta) + (broihranaZaKotki * hranaZaKotki);
        System.out.println(Sum + " lv.");
    }
}

       // Напишете програма, която пресмята нужните разходи за закупуването на храна за кучета и котки. Храната се пазарува от зоомагазин, като една опаковка храна за кучета е на цена 2.50 лв, а опаковка храна за котки струва 4 лв.
