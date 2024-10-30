package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num % 2 == 0) {
            System.out.println("odd/4etno");
        } else {
            System.out.println("even/ne4etno");
        }
    }
}
