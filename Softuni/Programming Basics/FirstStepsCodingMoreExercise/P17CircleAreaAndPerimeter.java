package FirstStepsCodingMoreExercise;

import java.util.Scanner;

public class P17CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която чете от конзолата число r
        double r = Double.parseDouble (scanner.nextLine());
        // и пресмята и отпечатва лицето и // периметъра на кръг / окръжност с радиус r,
        double area = Math.PI*r*r;
        double perimeter = 2*Math.PI*r;
        // като форматирате изхода в следния вид: "<calculated area>"
        //"<calculated parameter>".
        //Форматирайте изходните данни до втория знак след десетичната запетая.
        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f",perimeter);


    }
}
