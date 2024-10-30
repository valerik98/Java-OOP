package NestedLoops;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());

        while (!destination.equals("End")) {
            double savings = 0;
            double money = 0;

            while (savings < budget){
                money = Double.parseDouble(scanner.nextLine());
                savings += money;
            }
            System.out.printf("Going to %s!%n",destination);
            destination = scanner.nextLine();
            if (destination.equals("End")){
                return;
            }
            budget = Double.parseDouble (scanner.nextLine());
        }
    }
}
