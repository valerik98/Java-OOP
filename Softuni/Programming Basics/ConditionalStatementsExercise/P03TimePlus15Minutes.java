package ConditionalStatementsExercise;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма, която чете час и минути от 24-часово денонощие,
        // въведени от потребителя и изчислява колко ще е часът след 15 минути.
        int hours = Integer.parseInt (scanner.nextLine());
        int minutes = Integer.parseInt (scanner.nextLine());
        int hoursInMinutes = hours * 60 + minutes + 15;
        int totalHours = hoursInMinutes/60;
        int totalMinutes = hoursInMinutes%60;
        // Резултатът да се отпечата във формат часове:минути.
        // Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
        // Часовете се изписват с една или две цифри.
        // Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо
        if (totalHours>23){
            totalHours=0;
        }
        System.out.printf("%d:%02d",totalHours,totalMinutes);
    }
}
