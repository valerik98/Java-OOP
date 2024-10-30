package ForLoopExercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //· Достигнат етап от турнира – текст – "W", "F" или "SF"

        int tournamentCounts = Integer.parseInt (scanner.nextLine());
        int startingPoints = Integer.parseInt (scanner.nextLine());
        int totalPoints = startingPoints;
        int pW = 0;

        for (int i = 1; i <= tournamentCounts; i++) {
            String rank = scanner.nextLine();
            switch (rank){
                case "W":
                    totalPoints+=2000;
                    pW++;
                    break;
                case "F":
                    totalPoints+=1200;
                    break;
                case "SF":
                    totalPoints+=720;
                    break;
            }

        }
        int averagePoints = (totalPoints-startingPoints)/tournamentCounts;
        double percentWins = (pW*1.0/tournamentCounts)*100;
        System.out.printf("Final points: %d%n",totalPoints);
        System.out.printf("Average points: %d%n",averagePoints);
        System.out.printf("%.2f%%",percentWins);
    }
}
