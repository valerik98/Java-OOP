package ConditionalStatementsExercise;

import java.util.Scanner;

public class P08OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Напишете програма, която прочита време на изпит и време на пристигане и
        // отпечатва дали студентът е дошъл навреме,
        // дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int totalMinutesExam = examHour * 60 + examMinutes;
        int totalMinutesArrival = arrivalHour * 60 + arrivalMinutes;

        // Счита се, че студентът е дошъл навреме,
        // ако е пристигнал в часа на изпита или до половин час преди това.
        // Ако е пристигнал по-рано повече от 30 минути, той е подранил.
        // Ако е дошъл след часа на изпита, той е закъснял.
        int diff = Math.abs(totalMinutesArrival-totalMinutesExam);
        if (totalMinutesArrival <= totalMinutesExam && totalMinutesArrival >= totalMinutesExam - 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start",diff);
            //навреме
        } else if (totalMinutesArrival < totalMinutesExam - 30) {
            System.out.println("Early");
            //подранил
        } else if (totalMinutesArrival > totalMinutesExam) {
            System.out.println("Late");
            //закъснял
        }
        //Изход
        //На първият ред отпечатайте:
        //· "Late", ако студентът пристига по-късно от часа на изпита.
        //· "On time", ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
        //· "Early", ако студентът пристига повече от 30 минути преди часа на изпита.
        int hours = diff/60;
        int minutes = diff%60;
        if (totalMinutesArrival < totalMinutesExam - 30 && diff<60){
            System.out.printf("%d minutes before the start",diff);
        } else if (totalMinutesArrival < totalMinutesExam - 30 && diff>=60){
            System.out.printf("%d:%02d hours before the start",hours, minutes);
        } else if (totalMinutesArrival > totalMinutesExam && diff<60){
            System.out.printf("%d minutes after the start",diff);
        } else if (totalMinutesArrival > totalMinutesExam && diff >=60){
            System.out.printf("%d:%02d hours after the start",hours, minutes);
        }
        }
        //Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
        //· "mm minutes before the start" за идване по-рано с по-малко от час.
        //· "hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
        //· "mm minutes after the start" за закъснение под час.
        //· "hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03
    }

