package ForLoopExercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble (scanner.nextLine());
        double toysPrice = Double.parseDouble (scanner.nextLine());
        int countToys = 0;
        int lilySavings = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                lilySavings+=i*5-1;
            } else {
                countToys++;
            }
        }
        double totalSum = lilySavings + countToys*toysPrice;
        double diff = Math.abs(totalSum-washingMachinePrice);
        if (totalSum >= washingMachinePrice){
            System.out.printf("Yes! %.2f",diff);
        } else {
            System.out.printf("No! %.2f",diff);
        }

    }
}
