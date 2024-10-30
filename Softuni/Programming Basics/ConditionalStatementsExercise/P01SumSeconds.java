package ConditionalStatementsExercise;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
        int timeFirst = Integer.parseInt (scanner.nextLine());
        int timeSecond = Integer.parseInt (scanner.nextLine());
        int timeThird = Integer.parseInt (scanner.nextLine());
        // Да се напише програма, която чете времената на състезателите в секунди,
        // въведени от потребителя и пресмята сумарното им време във формат "минути:секунди".
        int sum = timeSecond+timeFirst+timeThird;
        int totalMinutes = sum/60;
        int totalSeconds = sum%60;
        // Секундите да се изведат с водеща нула (2 - "02", 7 - "07", 35 -"35"
        System.out.printf("%d:%02d",totalMinutes, totalSeconds);
    }
}
