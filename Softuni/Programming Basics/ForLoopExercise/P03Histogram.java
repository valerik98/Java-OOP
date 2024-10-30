package ForLoopExercise;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Дадени са n цели числа в интервала [1…1000].
        // От тях някакъв процент p1 са под 200,
        // друг процент p2 са от 200 до 399,
        // друг процент p3 са от 400 до 599,
        // друг процент p4 са от 600 до 799 и
        // останалите p5 процента са от 800 нагоре.
        // Да се напише програма, която изчислява и отпечатва процентите p1, p2, p3, p4 и p5
        //Вход
        //
        //На първия ред от входа стои цялото число n (1 ≤ n ≤ 1000) – брой числа.
        // На следващите n реда стои по едно цяло число в интервала [1…1000] –
        // числата върху които да бъде изчислена хистограмата.
        int n = Integer.parseInt (scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt (scanner.nextLine());
            if (number < 200){
                p1 ++;
            } else if (number <400){
                p2 ++;
            } else if (number <600){
                p3 ++;
            } else if (number <800){
                p4 ++;
            } else{
                p5 ++;
            }
        }
        double percent1 = 1.0*p1/n * 100;
        double percent2 = 1.0*p2/n * 100;
        double percent3 = 1.0*p3/n * 100;
        double percent4 = 1.0*p4/n * 100;
        double percent5 = 1.0*p5/n * 100;
        //
        //Изход
        //
        //Да се отпечата на конзолата хистограмата – 5 реда,
        // всеки от които съдържа число между 0% и 100%,
        // с точност две цифри след десетичната точка, например 25.00%, 66.67%, 57.14%.
        System.out.printf("%.2f%%%n",percent1);
        System.out.printf("%.2f%%%n",percent2);
        System.out.printf("%.2f%%%n",percent3);
        System.out.printf("%.2f%%%n",percent4);
        System.out.printf("%.2f%%",percent5);
    }
}
