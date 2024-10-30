package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P19WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double degrees = Double.parseDouble (scanner.nextLine());
        //26.00 - 35.00	Hot
        //20.1 - 25.9	Warm
        //15.00 - 20.00	Mild
        //12.00 - 14.9	Cool
        //5.00 - 11.9	Cold
        if (5.00<=degrees && degrees<12){
            System.out.println("Cold");           
        } else if (12.00<=degrees && degrees<15) {
            System.out.println("Cool");
        } else if (15.00<=degrees && degrees<20.1) {
            System.out.println("Mild");
        } else if (20.1<=degrees && degrees<26){
            System.out.println("Warm");
        } else if (26<=degrees && degrees<=35){
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }

    }
}
