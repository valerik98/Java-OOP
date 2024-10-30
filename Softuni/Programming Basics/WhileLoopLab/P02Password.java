package WhileLoopLab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String acc = scanner.nextLine();
        String pass = scanner.nextLine();
        String password = scanner.nextLine();

        while (!password.equals(pass)){

            password = scanner.nextLine();
        }
            System.out.printf("Welcome %s!",acc);

    }
}
