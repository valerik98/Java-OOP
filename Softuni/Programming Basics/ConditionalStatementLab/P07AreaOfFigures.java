package ConditionalStatementLab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма, в която потребителят въвежда вида и размерите на геометрична фигура
        // и пресмята лицето й. Фигурите са четири вида:
        // квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle).
        // На първия ред на входа се чете вида на фигурата
        // (текст със следните възможности: square, rectangle, circle или triangle).
        String figure = scanner.nextLine();
        double area=0;
        if (figure.equals("square")){
            double a = Double.parseDouble (scanner.nextLine());
            area = a*a;
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble (scanner.nextLine());
            double b = Double.parseDouble (scanner.nextLine());
            area = a*b;
        } else if (figure.equals("circle")){
            double radius = Double.parseDouble (scanner.nextLine());
            area = radius*radius*Math.PI;
        } else if (figure.equals("triangle")){
            double a = Double.parseDouble (scanner.nextLine());
            double ha = Double.parseDouble (scanner.nextLine());
            area = a*ha/2;
        }
        System.out.printf("%.3f",area);
        //Резултатът да се закръгли до 3 цифри след десетичната запетая.
    }
}
