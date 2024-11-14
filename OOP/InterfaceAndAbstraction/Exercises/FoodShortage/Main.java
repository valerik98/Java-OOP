package FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Map<String, Buyer> buyers = new HashMap();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            String age = tokens[1];

            if (tokens.length == 3) {
                String group = tokens[2];
                Rebel rebel = new Rebel(name, Integer.parseInt(age), group);
                buyers.putIfAbsent(name, rebel);
            } else {
                String id = tokens[2];
                String birthDate = tokens[3];
                Citizen citizen = new Citizen(name, Integer.parseInt(age), id, birthDate);
                buyers.putIfAbsent(name, citizen);
            }
        }

        String buyer = scanner.nextLine();

        while (!"End".equals(buyer)) {
            Buyer buyer1 = buyers.get(buyer);

            if (buyer1 != null) {
                buyer1.buyFood();
            }

            buyer = scanner.nextLine();
        }

        int totalFood = buyers.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();

        System.out.println(totalFood);
    }
}
