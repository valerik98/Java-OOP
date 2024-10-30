package WhileLoopExercises;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String favBook = scanner.nextLine();
        String book = scanner.nextLine();
        int counter = 0;
        while (!book.equals(favBook)){
            if (book.equals("No More Books")){
                break;
            }
            counter ++;
            book = scanner.nextLine();

        }
        if (book.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        } else if (book.equals(favBook)) {
            System.out.printf("You checked %d books and found it.",counter);
        }
    }
}
