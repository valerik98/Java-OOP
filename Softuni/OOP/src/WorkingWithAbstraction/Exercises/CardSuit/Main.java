package WorkingWithAbstraction.Exercises.CardSuit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Card Suits:");
        Arrays.stream(Suit.values())
                .forEach(System.out::println);
    }
}
