package WhileLoopLab;

import java.util.Scanner;

public class P04Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt (scanner.nextLine());
        int number = 1;

        while (n>=number){
            System.out.println(number);
            number = 2*number +1;

        }
    }
}
