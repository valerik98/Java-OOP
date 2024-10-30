package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Да се напише програма която чете ден от седмицата (текст) –
        // въведен от потребителя и принтира на конзолата цената на билет за кино според деня от седмицата:
        String day = scanner.nextLine();
        //Monday Tuesday Wednesday Thursday Friday Saturday Sunday
        //
        //12       12      14       14       12      16      16
        switch (day){
            case "Monday":
                System.out.println("12");
                break;
            case "Tuesday":
                System.out.println("12");
                break;
            case "Wednesday":
                System.out.println("14");
                break;
            case "Thursday":
                System.out.println("14");
                break;
            case "Friday":
                System.out.println("12");
                break;
            case "Saturday":
                System.out.println("16");
                break;
            case "Sunday":
                System.out.println("16");
                break;
        }
    }
}
