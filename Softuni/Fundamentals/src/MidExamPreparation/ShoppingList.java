package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while(!input.equals("Go Shopping!")){

            String command = input.split(" ")[0];
            String item = input.split(" ")[1];

            switch (command){
                case "Urgent":
                    if (!shoppingList.contains(item)){
                        shoppingList.add(0,item);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = input.split(" ")[2];
                    if (shoppingList.contains(item)){
                        int indexOfOldItem = shoppingList.indexOf(item);
                        shoppingList.set(indexOfOldItem,newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
