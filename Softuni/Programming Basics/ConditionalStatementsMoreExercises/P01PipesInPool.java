package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt (scanner.nextLine());
        int p1 = Integer.parseInt (scanner.nextLine());
        int p2 = Integer.parseInt (scanner.nextLine());
        double h = Double.parseDouble (scanner.nextLine());

        double p1Load = (p1*h);
        double p2Load =  (p2*h);
        double totalLoad= p1Load + p2Load;
        double percentLoad = totalLoad*100/v;

        double p1LoadPercentage = (p1Load * 100) /totalLoad;
        double p2LoadPercentage = (p2Load * 100) /totalLoad;
        double difference = Math.abs(totalLoad-v);
        if (v>=totalLoad){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percentLoad,p1LoadPercentage,p2LoadPercentage);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,difference);
        }
    }
}
