package WhileLoopExercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spendCounter = 0;
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int totalDays = 0;

        while (moneyAvailable < moneyNeeded && spendCounter < 5) {
            String action = scanner.nextLine();
            double moneyForS = Double.parseDouble(scanner.nextLine());
            if (moneyAvailable<0){
                moneyAvailable = 0;
            }
            if (action.equals("spend")) {
                moneyAvailable -= moneyForS;
                spendCounter++;
            } else if (action.equals("save")) {
                moneyAvailable += moneyForS;
                spendCounter = 0;
            }
            totalDays++;


        }
        if (spendCounter == 5){
            System.out.println("You can't save the money.");
            System.out.printf("%d",totalDays);
        } else if (moneyAvailable>=moneyNeeded) {
            System.out.printf("You saved the money for %d days.",totalDays);
        }
    }
}
