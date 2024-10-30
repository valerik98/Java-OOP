package ForLoopMoreExercies;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLoads = Integer.parseInt(scanner.nextLine());

        int totalLoads = 0;
        int mikrobusLoads = 0;
        int kamionLoads = 0;
        int vlakLoads = 0;
        for (int i = 1; i <= countLoads; i++) {
            int currentLoad = Integer.parseInt(scanner.nextLine());
            if (currentLoad <= 3) {
                //vehicle = "mikrobus";
                mikrobusLoads += currentLoad;
            } else if (currentLoad <= 11) {
                //vehicle = "kamion";
                kamionLoads += currentLoad;
            } else {
                // vehicle = "vlak";
                vlakLoads += currentLoad;
            }
            totalLoads += currentLoad;
        }
        double avgSum = 1.0 * (mikrobusLoads * 200 + kamionLoads * 175 + vlakLoads * 120) / totalLoads;

        double percentMikrobus = 1.0 * mikrobusLoads / totalLoads * 100;
        double percentKamion = 1.0 * kamionLoads / totalLoads * 100;
        double percentVlak = 1.0 * vlakLoads / totalLoads * 100;

        System.out.printf("%.2f%n",avgSum);
        System.out.printf("%.2f%%%n",percentMikrobus);
        System.out.printf("%.2f%%%n",percentKamion);
        System.out.printf("%.2f%%%n",percentVlak);

    }
}
