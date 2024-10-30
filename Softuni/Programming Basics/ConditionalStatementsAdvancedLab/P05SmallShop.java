package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число),
        // въведени от потребителя и пресмята и отпечатва колко струва съответното количество от избрания продукт
        // в посочения град.
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double coffee, water, beer, sweets, peanuts;
        switch (town) {
            case "Sofia":
                if (product.equals("coffee")) {
                    price = quantity * 0.50;
                } else if (product.equals("water")) {
                    price = quantity * 0.80;
                } else if (product.equals("beer")) {
                    price = quantity * 1.20;
                } else if (product.equals("sweets")) {
                    price = quantity * 1.45;
                } else if (product.equals("peanuts")) {
                    price = quantity * 1.60;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    price = quantity * 0.40;
                } else if (product.equals("water")) {
                    price = quantity * 0.70;
                } else if (product.equals("beer")) {
                    price = quantity * 1.15;
                } else if (product.equals("sweets")) {
                    price = quantity * 1.30;
                } else if (product.equals("peanuts")) {
                    price = quantity * 1.50;
                }
                    break;
                    case "Varna":
                        if (product.equals("coffee")) {
                            price = quantity * 0.45;
                        } else if (product.equals("water")) {
                            price = quantity * 0.70;
                        } else if (product.equals("beer")) {
                            price = quantity * 1.10;
                        } else if (product.equals("sweets")) {
                            price = quantity * 1.35;
                        } else if (product.equals("peanuts")) {
                            price = quantity * 1.55;
                        }
                            break;
                        }
        System.out.println(price);
    }
}
