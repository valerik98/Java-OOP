package WhileLoopLab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int maxValue = Integer.MIN_VALUE;

        while (!command.equals("Stop")) {
            int number = Integer.parseInt(command);
            if (number > maxValue) {
                maxValue = number;
            }


            command = scanner.nextLine();
        }
        System.out.println(maxValue);


    }
}
