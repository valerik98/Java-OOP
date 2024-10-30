package ForLoopExercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabCounts = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int fee = 0;

        for (int i = 1; i <= tabCounts; i++) {
            String text = scanner.nextLine();
            switch (text) {
                case "Facebook":
                    fee += 150;
                    break;
                case "Instagram":
                    fee += 100;
                    break;
                case "Reddit":
                    fee += 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        int diff = Math.abs(salary - fee);
        System.out.println(diff);
    }
}
