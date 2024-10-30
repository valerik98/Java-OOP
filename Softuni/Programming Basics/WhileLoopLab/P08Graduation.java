package WhileLoopLab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int klas = 1;
        double totalSum = 0;
        int broiPytiSkysan = 0;

        while (klas <= 12) {

            if (broiPytiSkysan > 1) {
                break;
            }
            double ocenka = Double.parseDouble(scanner.nextLine());
            if (ocenka < 4) {
                broiPytiSkysan++;
                continue;
            }
            totalSum += ocenka;
            klas++;
        }
        double avgGrade = totalSum / 12;
        if (broiPytiSkysan > 1){
            System.out.printf("%s has been excluded at %d grade", studentName, klas);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, avgGrade);
        }

    }
}
