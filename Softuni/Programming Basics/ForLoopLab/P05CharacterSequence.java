package ForLoopLab;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Напишете програма, която чете текст (стринг), въведен от потребителя
        // и печата всеки символ от текста на отделен ред.
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            System.out.println(letter);
        }
    }
}
