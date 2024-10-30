package ForLoopLab;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Да се напише програма, която чете n-на брой цели числа,
        // подадени от потребителя и проверява дали сумата от числата на четни позиции
        // е равна на сумата на числата на нечетни позиции.
        int n = Integer.parseInt (scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt (scanner.nextLine());
            if (i % 2 == 0){
                sumOdd += number;
            } else {
                sumEven += number;
            }

        }
        if (sumOdd == sumEven){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            int diff = Math.abs(sumEven-sumOdd);
            System.out.printf("Diff = %d",diff);
        }


        //· Ако сумите са равни да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
        //
        //· Ако сумите не са равни да се отпечат два реда: "No" и на нов ред "Diff = " + разликата.
        //
        //Разликата се изчислява по абсолютна стойност.
    }
}
