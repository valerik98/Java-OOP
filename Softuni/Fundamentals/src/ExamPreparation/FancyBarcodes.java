package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {

                StringBuilder productGroup = new StringBuilder();
                for (char currentSymbol : barcode.toCharArray()) {
                    if (Character.isDigit(currentSymbol)) {
                        productGroup.append(Integer.parseInt(currentSymbol + ""));
                    }
                }
                if (productGroup.length() == 0) {
                    productGroup = new StringBuilder("00");
                }
                System.out.println("Product group: " + productGroup);

            }else {
                System.out.println("Invalid barcode");
            }


        }

    }
}
