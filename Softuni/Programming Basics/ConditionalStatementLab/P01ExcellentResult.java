package ConditionalStatementLab;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напише конзолна програма, която чете оценка (цяло число),
        // въведена от потребителя и отпечатва "Excellent!" ако оценката е 5 или по-висока.

        int grade = Integer.parseInt (scanner.nextLine());

        if (grade>=5){
            System.out.println("Excellent!");
        }
    }
}
