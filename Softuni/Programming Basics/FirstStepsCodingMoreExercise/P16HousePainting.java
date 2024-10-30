package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P16HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вход
        //От конзолата се четат 3 реда:
        //1.	x – височината на къщата – реално число в интервала [2...100]
        //2.	y – дължината на страничната стена – реално число в интервала [2...100]
        //3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        // Разхода на зелената боя е 1 литър за 3.4 м2,
        // а на червената – 1 литър за 4.3 м2.
        double consumptionGreenPaint = 3.4;
        double consumptionRedPaint = 4.3;
        //Стените имат следните размери:
        //•	Предната и задната стена са квадрати със страна „x“
        //o	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м
        double sFrontWall = x*x - (1.2*2);
        double sBackWall = x*x;
        //•	Страничните стени са правоъгълници със страни „x“ и „y“
        //o	и на двете странични стени има по един квадратен прозорец със страна 1.5м
        double sSideWalls = 2*(x*y - (1.5*1.5));
        //Покривът има следните размери:
        //•	Два правоъгълника със страни „x“ и „y“
        //•	Два равностранни триъгълника със страна „x“ и височина „h“
        double sSidesRoof = 2*x*y;
        double sTrianglesRoof = 2*x*h/2;
        // Като за стените се използва зелена боя,
        // а за покрива – червена.
        double greenPaint = (sFrontWall+sBackWall+sSideWalls)/consumptionGreenPaint;
        double redPaint = (sSidesRoof+sTrianglesRoof)/consumptionRedPaint;
        //Изход
        //Да се отпечатат на конзолата две числа всяко на нов ред:
        //•	Литрите зелена боя
        //•	Литритe червена боя
        //Форматирани до вторият знак след десетичната запетая.
        System.out.printf("%.2f%n",greenPaint);
        System.out.printf("%.2f",redPaint);

    }
}
