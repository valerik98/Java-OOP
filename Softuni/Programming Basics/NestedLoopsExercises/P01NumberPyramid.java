package NestedLoopsExercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                if (count > n) {
                    return;
                }
                System.out.printf("%d ", count);
                count++;

            }

            System.out.println();

        }
    }
}
