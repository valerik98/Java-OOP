package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P10Multiplyby2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Напишете програма, която да умножава положителни числа по 2.
        // От конзолата се четат поредица от реални числа, всяко на нов ред,
        // докато не се въведе отрицателно.
        double number = Double.parseDouble (scanner.nextLine());

        while (number>=0){
            number *= 2;
            System.out.printf("Result: %.2f%n",number);
            number = Double.parseDouble (scanner.nextLine());
        }
        if (number<0){
            System.out.println("Negative number!");
        }
        // След всяко умножено число на нов ред да се отпечата "Result: {резултата от умножението}".
        // Резултата от умножението да бъде форматиран до втория знак след десетичния разделител.
        // При получаване на негативно число, на конзолата да се отпечата "Negative number!" и
        // програмата да приключи изпълнение.
    }
}
