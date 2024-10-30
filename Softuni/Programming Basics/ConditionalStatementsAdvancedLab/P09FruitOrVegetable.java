package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Да се напише програма, която чете име на продукт,
        // въведено от потребителя и проверява дали е плод или зеленчук.
        String product = scanner.nextLine();
        switch (product){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;

        }
        //· Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        //
        //· Всички останали са "unknown"
        //
        //Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.
    }
}
