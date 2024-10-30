package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P08PointonRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double x1 = Double.parseDouble (scanner.nextLine());
        double y1 = Double.parseDouble (scanner.nextLine());
        double x2 = Double.parseDouble (scanner.nextLine());
        double y2 = Double.parseDouble (scanner.nextLine());
        double x = Double.parseDouble (scanner.nextLine());
        double y = Double.parseDouble (scanner.nextLine());

        //. Точка {x, y} лежи върху някоя от страните на правоъгълник ako
        //•	x съвпада с x1 или x2 и същевременно y е между y1 и y2
        //•	y съвпада с y1 или y2 и същевременно x е между x1 и x2

        if (((x==x1 || x==x2) && (y1<=y && y<=y2)) || ((y==y1 || y==y2) && (x1<=x && x<=x2))) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
        //. Точка {x, y} е вътре в правоъгълника ako
        //•	x е между х1 и х2
        //•	y между у1 и у2

        //Да се отпечата "Border" (точката лежи на някоя от страните) или "Inside / Outside" (в противен случай).
//if ((x1<x || x<x2) && (y1<y && y<y2))
    }
}
