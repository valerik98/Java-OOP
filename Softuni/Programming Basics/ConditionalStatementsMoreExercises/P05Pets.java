package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Марина обича да пътува.
        // Тя има 3 домашни любимеца (куче, котка и костенурка).
        // Когато заминава на пътешествие трябва да съобрази колко храна да им остави,за да не останат гладни.
        // Напишете програма, която пресмята колко килограма храна ще изядат всички за времето,
        // в което Марина отсъства и дали оставената храна от нея ще им е достатъчна.
        // Всяко животно изяжда определено количество храна на ден.
        //Вход
        //От конзолата се четат пет реда:
        //•	Първи ред – брой дни – цяло число в интервал [1…5000]
        //•	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
        //•	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
        //•	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
        //•	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]
        int days = Integer.parseInt (scanner.nextLine());
        int leftFoodKgs = Integer.parseInt (scanner.nextLine());
        double foodForDogPerDayKgs = Double.parseDouble (scanner.nextLine());
        double foodForCatPerDayKgs = Double.parseDouble (scanner.nextLine());
        double foodForTurtlePerDayGRAMS = Double.parseDouble (scanner.nextLine());
        double totalFoodForPets = days*(foodForDogPerDayKgs + foodForCatPerDayKgs + foodForTurtlePerDayGRAMS/1000);
        double difference = Math.abs(leftFoodKgs - totalFoodForPets);
        //Изход
        //На конзолата трябва да се отпечата на един ред:
        //•	Ако оставената храна Е достатъчна:
        //o	"{килограма остатък} kilos of food left."
        //	Резултатът трябва да е закръглен към по-ниското цяло число
        if (leftFoodKgs>=totalFoodForPets){
            System.out.printf("%.0f kilos of food left.",Math.floor(difference));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(difference));
        }
        //•	Ако оставената храна НЕ Е достатъчна:
        //o	“{килограма недостигат} more kilos of food are needed.”
        //	Резултатът трябва да е закръглен към по-високото цяло число
    }
}
