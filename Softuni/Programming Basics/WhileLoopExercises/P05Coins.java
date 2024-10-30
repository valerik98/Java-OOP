package WhileLoopExercises;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        change = change*100;
        change = Math.floor(change);

        while (change != 0) {
            if (change >= 200) {
                change -= 200;
                coins++;
            } else if (change >= 100) {
                change -= 100;
                coins++;
            } else if (change >= 50) {
                change -= 50;
                coins++;
            } else if (change >= 20) {
                change -= 20;
                coins++;
            } else if (change >= 10) {
                change -= 10;
                coins++;
            } else if (change >= 5) {
                change -= 5;
                coins++;
            } else if (change >= 2) {
                change -= 2;
                coins++;
            } else if (change >= 1) {
                change -= 1;
                coins++;
            }


        }
        System.out.println(coins);
    }
}
