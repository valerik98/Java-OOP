package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // колко часа на ден трябва да отделя, за да прочете необходимата литература.

        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysForReading = Integer.parseInt(scanner.nextLine());

        // Общо време за четене на книгата: 212 страници / 20 страници за час = 10 часа общо
        // Необходимите часове на ден: 10 часа / 2 дни = 5 часа на деn

        int totalTime = pagesInBook/pagesPerHour;
        int neededTime = totalTime/daysForReading;

        System.out.println(neededTime);
    }
}
