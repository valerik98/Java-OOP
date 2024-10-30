package NestedLoops;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int floors = Integer.parseInt (scanner.nextLine());
        int rooms = Integer.parseInt (scanner.nextLine());

        for (int i = floors; i >=1 ; i--) {
            int floor = i;
            for (int j = 0; j <rooms ; j++) {
                if (floor==floors){
                    System.out.printf("L%d%d ",i, j);
                } else if (i%2==0){
                    System.out.printf("O%d%d ",i,j);
                } else {
                    System.out.printf("A%d%d ",i,j);
                }
            }
            System.out.println();
        }
    }
}
