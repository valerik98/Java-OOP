package ForLoopExercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number>maxValue){
            maxValue = number;
            }
        }
        int sumWithoutMax = sum - maxValue;
        if (sumWithoutMax == maxValue){
            System.out.println("Yes");
            System.out.println("Sum = " + maxValue);
        }else {
            System.out.println("No");
            int diff = Math.abs(maxValue - sumWithoutMax);
            System.out.println("Diff = " + diff);
        }
    }
}
