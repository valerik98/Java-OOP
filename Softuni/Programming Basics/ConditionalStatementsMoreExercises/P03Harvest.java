package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareMeters = Integer.parseInt (scanner.nextLine());
        double grapeKilograms = Double.parseDouble (scanner.nextLine());
        int wineNeededLiters = Integer.parseInt (scanner.nextLine());
        int workers = Integer.parseInt (scanner.nextLine());

        //От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
        // От 1 кв.м лозе се изкарват Y килограма грозде.
        // За 1 литър вино са нужни 2,5 кг. грозде.
        // Желаното количество вино за продан е Z литра.
        //Напишете програма, която пресмята колко вино може да се произведе
        // и дали това количество е достатъчно.
        // Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.
        double harvest = squareMeters*grapeKilograms;
        double wine = 0.4*harvest/2.5;
        double difference = Math.abs(wine - wineNeededLiters);
        double winePerPerson = difference/workers;
        //Изход
        //На конзолата трябва да се отпечата следното:
        //•	Ако произведеното вино е по-малко от нужното:
        //o	“It will be a tough winter! More {недостигащо вино} liters wine needed.”
        //	Резултатът трябва да е закръглен към по-ниско цяло число
        if (wine<wineNeededLiters){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(difference));
        }else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(difference),Math.ceil(winePerPerson));

        }
        //•	Ако произведеното вино е колкото или повече от нужното:
        //o	“Good harvest this year! Total wine: {общо вино} liters.”
        //	Резултатът трябва да е закръглен към по-ниско цяло число
        //o	“{Оставащо вино} liters left -> {вино за 1 работник} liters per person.”
        //	И двата резултата трябва да са закръглени към по-високото цяло число
    }
}
