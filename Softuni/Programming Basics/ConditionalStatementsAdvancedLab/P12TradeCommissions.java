package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // изчислява и извежда размера на търговската комисионна според горната таблица.

        String city = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());
        double commission=0;
        switch (city) {
            case "Sofia":
                if (0<=salesVolume && salesVolume<=500){
                    commission = 0.05*salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (500<=salesVolume && salesVolume<=1000) {
                    commission = 0.07*salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (1000<=salesVolume && salesVolume<=10000) {
                    commission = 0.08 * salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (salesVolume>10000) {
                    commission = 0.12 * salesVolume;
                    System.out.printf("%.2f",commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (0<=salesVolume && salesVolume<=500){
                    commission = 0.045*salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (500<=salesVolume && salesVolume<=1000) {
                    commission = 0.075*salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (1000<=salesVolume && salesVolume<=10000) {
                    commission = 0.1 * salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (salesVolume>10000) {
                    commission = 0.13 * salesVolume;
                    System.out.printf("%.2f",commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (0<=salesVolume && salesVolume<=500){
                    commission = 0.055*salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (500<=salesVolume && salesVolume<=1000) {
                    commission = 0.08*salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (1000<=salesVolume && salesVolume<=10000) {
                    commission = 0.12 * salesVolume;
                    System.out.printf("%.2f",commission);
                } else if (salesVolume>10000) {
                    commission = 0.145 * salesVolume;
                    System.out.printf("%.2f",commission);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
// Резултатът да се изведе форматиран до 2 цифри след десетичната точка.
// При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".