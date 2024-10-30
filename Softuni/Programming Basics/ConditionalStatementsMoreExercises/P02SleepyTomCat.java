package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt (scanner.nextLine());
        int norm = 30000;
        int workDays = 365 - daysOff;
        int playTime = workDays*63 + daysOff*127;
        int difference = Math.abs(playTime - norm);
        //Изход
        //На конзолата трябва да се отпечатат два реда.
        //•	Ако времето за игра на Том е над нормата за текущата година:
        //o	 На първия ред отпечатайте: “Tom will run away”
        //o	 На втория ред отпечатайте разликата от нормата във формат:
        //“{H} hours and {M} minutes more for play”
        int hours = difference/60;
        int minutes = difference%60;
        if (playTime>norm){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hours,minutes);
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hours,minutes);
        }



        //•	Ако времето за игра на Том е под нормата за текущата година:
        //o	На първия ред отпечатайте: “Tom sleeps well”
        //o	 На втория ред отпечатайте разликата от нормата във формат:
        //“{H} hours and {M} minutes less for play”
    }
}
