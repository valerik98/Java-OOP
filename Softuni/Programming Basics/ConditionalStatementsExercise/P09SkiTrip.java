package ConditionalStatementsExercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int days = Integer.parseInt (scanner.nextLine());
        String type = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0;

        if (type.equals("room for one person")){
            price = (days-1)*18;
        } else if (type.equals("apartment")){
            price = (days-1)*25;
            if (days < 10){
                price *=0.70;
            } else if (days < 15){
                price *= 0.65;
            } else {
                price *=0.50;
            }

        } else if (type.equals("president apartment")){
            price = (days-1)*35;
            if (days < 10){
                price *=0.90;
            } else if (days < 15){
                price *= 0.85;
            } else {
                price *=0.80;
            }
        }
if (rating.equals("positive")){
    price *= 1.25;
} else {
    price *= 0.90;
}
        System.out.printf("%.2f",price);
    }
}
