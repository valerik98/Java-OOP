package WhileLoopExercises;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = Integer.parseInt (scanner.nextLine());
        int b = Integer.parseInt (scanner.nextLine());

        int countPieces = a*b;
        int currentCountPieces = 0;
        String command = scanner.nextLine();

        while (!command.equals("STOP")){
            currentCountPieces = Integer.parseInt(command);
            countPieces -= currentCountPieces;

            if (countPieces<=0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
                break;
            }

            command= scanner.nextLine();
        }
        if (countPieces>0){
            System.out.printf("%d pieces are left.", countPieces);
        }

    }
}
