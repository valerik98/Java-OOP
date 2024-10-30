package ForLoopExercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalClimbers = 0;

        int countGroups = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countGroups; i++) {
            int countClimbersInGroup = Integer.parseInt(scanner.nextLine());

            if (countClimbersInGroup <= 5) {
                musala += countClimbersInGroup;
            } else if (countClimbersInGroup <= 12) {
                monblan += countClimbersInGroup;
            } else if (countClimbersInGroup <= 25) {
                kilimandjaro += countClimbersInGroup;
            } else if (countClimbersInGroup <= 40) {
                k2 += countClimbersInGroup;
            } else {
                everest += countClimbersInGroup;
            }

            totalClimbers += countClimbersInGroup;

        }
        double p1 = musala*1.0 / totalClimbers * 100;
        double p2 = monblan*1.0 / totalClimbers * 100;
        double p3 = kilimandjaro*1.0 / totalClimbers * 100;
        double p4 = k2*1.0 / totalClimbers * 100;
        double p5 = everest*1.0 / totalClimbers * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);

    }
}
