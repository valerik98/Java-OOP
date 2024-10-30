package WhileLoopLab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String command = scanner.nextLine();
        int minValue = Integer.MAX_VALUE;

        while (!command.equals("Stop")){
            int number = Integer.parseInt(command);
            if (number < minValue){
                minValue = number;
            }
            command = scanner.nextLine();

        }
        System.out.println(minValue);
    }
}
