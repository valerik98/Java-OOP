package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int countJuniorBikers = Integer.parseInt (scanner.nextLine());
        int countSeniorBikers = Integer.parseInt (scanner.nextLine());
        String trace = scanner.nextLine();
        double sum = 0;
        switch (trace){
            case "trail":
                sum = countJuniorBikers*5.50+countSeniorBikers*7;
                break;
            case "cross-country":
                sum = countJuniorBikers*8+countSeniorBikers*9.50;
                if ((countSeniorBikers+countJuniorBikers)>=50)
                    sum *= 0.75;

                break;
            case "downhill":
                sum = countJuniorBikers*12.25+countSeniorBikers*13.75;
                break;
            case "road":
                sum = countJuniorBikers*20+countSeniorBikers*21.50;
                break;
        }
        sum *= 0.95;
        System.out.printf("%.2f",sum);
    }
}
