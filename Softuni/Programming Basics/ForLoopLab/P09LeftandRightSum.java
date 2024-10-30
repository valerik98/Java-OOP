package ForLoopLab;

import java.util.Scanner;

public class P09LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
int sumLeft = 0;
int sumRight = 0;

        //Да се напише програма, която чете 2 * n-на брой цели числа,
        // подадени от потребителя, и проверява дали сумата на първите n числа (лява сума)
        // е равна на сумата на вторите n числа (дясна сума).

        for (int i = 0; i < 2*n; i++) {
            int number = Integer.parseInt (scanner.nextLine());
            if (i<n){
                sumLeft += number;
            }else {
                sumRight +=number;
            }

        }
        int diff = Math.abs(sumLeft - sumRight);
        if (sumLeft == sumRight){
            System.out.printf("Yes, sum = %d",sumRight);
        } else {
            System.out.printf("No, diff = %d",diff);
        }

        // При равенство печата " Yes, sum = " + сумата;
        // иначе печата " No, diff = " + разликата.
        // Разликата се изчислява като положително число (по абсолютна стойност).
    }
}
