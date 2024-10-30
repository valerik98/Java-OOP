package ForLoopMoreExercies;

import java.util.Scanner;
public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int yearOfDeath = Integer.parseInt(scanner.nextLine());
        double spend = 0;

        for (int i = 1800; i <= yearOfDeath; i++) {
            if (i % 2 == 0) {
                spend += 12000;
            }else {
                spend += 12000+50*(18+i-1800);
            }
        }
        if (money>=spend){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", Math.abs(money - spend));
        }else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(money - spend));
        }
    }
}
