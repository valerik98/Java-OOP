package ConditionalStatementsExercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която чете две цели числа (N1 и N2) и оператор,
        // с който да се извърши дадена математическа операция с тях.
        // Възможните операции са:
        // Събиране (+), Изваждане (-), Умножение (*), Деление (/) и Деление с остатък (%).

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String evenOrOdd = "";
        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        }
        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") ) {
            System.out.printf("%d %s %d = %.0f - %s", number1, operator, number2, result, evenOrOdd);
        }

        // При обикновеното де1ление – резултатът.
        // При модулното деление – остатъка. Трябва да се има предвид,
        // че делителят може да е равен на 0(нула), а на нула не се дели.
        // В този случай трябва да се отпечата специално съобщениe.
        if (operator.equals("/") && number2!=0) {
            result = 1.0 * number1 / number2;
            System.out.printf("%d %s %d = %.2f", number1, operator, number2, result);
        } else if (operator.equals("%") && number2!=0) {
            result = 1.0 * number1 % number2;
            System.out.printf("%d %s %d = %.0f", number1, operator, number2, result);
        } else if (number2 == 0) {
            System.out.printf("Cannot divide %d by zero", number1);
        }


}
}
