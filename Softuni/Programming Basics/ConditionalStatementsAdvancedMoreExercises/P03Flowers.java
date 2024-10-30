package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemums = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String ifTodayIsHoliday = scanner.nextLine();

        double chrysanthemumsPrice = 0;
        double tulipsPrice = 0;
        double rosesPrice = 0;
        double sum = 0;

        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumsPrice = 2 * countChrysanthemums;
            rosesPrice = 4.1 * countRoses;
            tulipsPrice = 2.5 * countTulips;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumsPrice = 3.75 * countChrysanthemums;
            rosesPrice = 4.50 * countRoses;
            tulipsPrice = 4.15 * countTulips;
        }
        sum = chrysanthemumsPrice + rosesPrice + tulipsPrice;
        if (ifTodayIsHoliday.equals("Y")){
            sum *= 1.15;
        }
        if (season.equals("Spring")) {
            if (countTulips > 7) {
                sum *= 0.95;
            }

        }
        if (season.equals("Winter")){
            if (countRoses>=10){
                sum *= 0.90;
            }
        }
        if ((countTulips+countRoses+countTulips)>20) {
            sum *= 0.80;
        }
        double totalSum = sum + 2;
        System.out.printf("%.2f",totalSum);
        }
    }
