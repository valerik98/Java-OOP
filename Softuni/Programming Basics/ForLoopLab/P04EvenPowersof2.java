package ForLoopLab;

import java.util.Scanner;
import java.lang.Math;

public class P04EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // Да се напише програма, която чете число n,
        // въведено от потребителя и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n.
        int n = Integer.parseInt (scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                int answer= (int) Math.pow(2,i);
                System.out.println(answer);
            }
            
        }
    }
}
