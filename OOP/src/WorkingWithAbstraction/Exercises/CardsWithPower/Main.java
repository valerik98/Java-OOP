package WorkingWithAbstraction.Exercises.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Rank rank = Rank.valueOf(scanner.nextLine());
        Suit suit = Suit.valueOf(scanner.nextLine());

        Card card = new Card(rank,suit);
        int cardPower = card.getCardPower();
        System.out.println(card);

//        Arrays.stream(Rank.values())
//                .forEach(System.out::println);

    }
}
