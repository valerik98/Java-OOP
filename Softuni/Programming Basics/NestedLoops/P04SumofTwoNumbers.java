package NestedLoops;

import java.util.Scanner;

public class P04SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int count = 0;

        for (int i = beginning; i <= ending ; i++) {
            for (int j = beginning; j <=ending ; j++) {
                sum = i+j;
                count++;
                if (sum==magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d",count,magicNumber);
    }
}
