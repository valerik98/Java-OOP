package ForLoopLab;

import java.util.Scanner;

public class P08Numbersequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Напишете програма, която чете n на брой цели числа.
        // Принтирайте най-голямото и най-малкото число сред въведените.
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int n = Integer.parseInt (scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt (scanner.nextLine());
            if (number <= minValue){
                minValue = number;
            }
            if (number >= maxValue){
                maxValue = number;
            }

        }
        System.out.printf("Max number: %d%n", maxValue);
        System.out.printf("Min number: %d", minValue);
    }
}
