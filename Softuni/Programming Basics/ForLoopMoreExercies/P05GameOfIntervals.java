package ForLoopMoreExercies;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMoves = Integer.parseInt(scanner.nextLine());
        double points1to10 = 0;
        double points10to20 = 0;
        double points20to30 = 0;
        double points30to40 = 0;
        double points40to50 = 0;
        double totalPoints = 0;
        double invalidPoints = 0;
        int p = 0;
        int pp = 0;
        int ppp = 0;
        int pppp = 0;
        int ppppp = 0;
        int inv = 0;

        for (int i = 1; i <= countMoves; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                points1to10 += 0.20 * number;
                totalPoints += points1to10;
                p++;

            } else if (number >= 10 && number <= 19) {
                points10to20 += 0.30 * number;
                totalPoints += points10to20;
                pp++;
            } else if (number >= 20 && number <= 29) {
                points20to30 += 0.40 * number;
                totalPoints += points20to30;
                ppp++;
            } else if (number >= 30 && number <=39){
                points30to40 += 50;
                totalPoints += points30to40;
                pppp++;
            } else if (number >= 40 && number <=50){
                points40to50 += 100;
                totalPoints += points40to50;
                ppppp++;
            }
            if (number < 0 || number > 50) {
                invalidPoints = totalPoints / 2;
                totalPoints -= invalidPoints;
                inv++;
            }
        }

        double percentPoints1to10 = 1.0 * p / countMoves * 100;
        double percentPoints10to20 = 1.0 * pp / countMoves * 100;
        double percentPoints20to30 = 1.0 * ppp / countMoves * 100;
        double percentPoints30to40 = 1.0 * pppp / countMoves * 100;
        double percentPoints40to50 = 1.0 * ppppp / countMoves * 100;
        double percentInvalidPoints = 1.0 * inv / countMoves * 100;

        System.out.printf("%.2f%n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", percentPoints1to10);
        System.out.printf("From 10 to 19: %.2f%%%n", percentPoints10to20);
        System.out.printf("From 20 to 29: %.2f%%%n", percentPoints20to30);
        System.out.printf("From 30 to 39: %.2f%%%n", percentPoints30to40);
        System.out.printf("From 40 to 50: %.2f%%%n", percentPoints40to50);
        System.out.printf("Invalid numbers: %.2f%%%n", percentInvalidPoints);


    }
}
