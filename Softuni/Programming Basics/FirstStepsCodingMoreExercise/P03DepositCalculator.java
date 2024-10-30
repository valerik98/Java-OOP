package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());
        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double interest = (deposit * interestRate)/100;
        double interestForMonth = interest/12;
        double totalMoney = deposit + months*interestForMonth;
        System.out.println(totalMoney);
    }
}
