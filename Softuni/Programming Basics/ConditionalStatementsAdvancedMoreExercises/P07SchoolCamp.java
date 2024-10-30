package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        String sex = scanner.nextLine();
        int countStudents = Integer.parseInt (scanner.nextLine());
        int countNights = Integer.parseInt (scanner.nextLine());

        double ratePerNight = 0;
        double totalSum = 0;
        String sport = "";
        switch (season){
            case "Winter":
        if (sex.equals("boys")||sex.equals("girls")){
            ratePerNight = 9.60;
        } else if (sex.equals("mixed")) {
            ratePerNight = 10;
        }
            break;
            case "Spring":
                if (sex.equals("boys")||sex.equals("girls")){
                    ratePerNight = 7.20;
                } else if (sex.equals("mixed")) {
                    ratePerNight = 9.50;
                }
                break;
            case "Summer":
                if (sex.equals("boys")||sex.equals("girls")){
                    ratePerNight = 15;
                } else if (sex.equals("mixed")) {
                    ratePerNight = 20;
                }
                break;
        }
            switch (season){
                case "Winter":
                    if (sex.equals("girls")){
                        sport = "Gymnastics";
                    } else if (sex.equals("boys")){
                        sport = "Judo";
                    } else if (sex.equals("mixed")) {
                        sport = "Ski";
                    }
                    break;
                case "Summer":
                    if (sex.equals("girls")){
                        sport = "Volleyball";
                    } else if (sex.equals("boys")){
                        sport = "Football";
                    } else if (sex.equals("mixed")) {
                        sport = "Swimming";
                    }
                    break;
                case "Spring":
                    if (sex.equals("girls")){
                        sport = "Athletics";
                    } else if (sex.equals("boys")){
                        sport = "Tennis";
                    } else if (sex.equals("mixed")) {
                        sport = "Cycling";
                    }
                    break;
            }
            totalSum = countStudents * ratePerNight * countNights;
        if (countStudents>=50){
            totalSum*=0.50;
        } else if (countStudents>=20){
            totalSum*=0.85;
        }else if (countStudents>=10){
            totalSum*=0.95;
        }

        System.out.printf("%s %.2f lv.",sport, totalSum);
    }
}
