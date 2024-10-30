package WhileLoopLab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = 0;
        String command = scanner.nextLine();

        while (!command.equals("NoMoreMoney")) {
            double deposit = Double.parseDouble(command);
            if (deposit<0){
                System.out.println("Invalid operation!");
                break;
            }
            totalMoney += deposit;
            System.out.printf("Increase: %.2f%n", deposit);
            command = scanner.nextLine();


        }

        System.out.printf("Total: %.2f", totalMoney);
    }

}
