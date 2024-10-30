package WhileLoopExercises;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int w = Integer.parseInt (scanner.nextLine());
        int h = Integer.parseInt (scanner.nextLine());
        int l = Integer.parseInt (scanner.nextLine());

        int space = w*h*l;
        int currentspace = 0;
        String command = scanner.nextLine();
        int diff = 0;

        while (!command.equals("Done")){
            int countBoxes = Integer.parseInt(command);
            currentspace +=countBoxes;

            if (currentspace>=space){
                diff = Math.abs(space - currentspace);
                System.out.printf("No more free space! You need %d Cubic meters more.",diff);
                break;
            }
            command = scanner.nextLine();
        }
            if (command.equals("Done")){
                diff = Math.abs(space - currentspace);
                System.out.printf("%d Cubic meters left.",diff);
            }



    }
}
