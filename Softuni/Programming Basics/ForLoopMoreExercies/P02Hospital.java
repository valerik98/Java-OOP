package ForLoopMoreExercies;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 7 lekara mogat samo po 1 na den da preglejdat --- 7 pregleda
        // vseki 3ti den i ako броят на непрегледаните пациенти е по-голям от броя на прегледаните
        //се назначава още един лекар. Като назначаването става преди да започне приемът на пациенти за деня.
        int days = Integer.parseInt(scanner.nextLine());
        int countDoctors = 7;
        int untreatedPatients = 0;
        int treatedPatientsCount = 0;

        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (untreatedPatients > treatedPatientsCount) {
                    countDoctors++;
                }
            }

            if (countDoctors >= patients) {
                treatedPatientsCount += patients;
            } else if (countDoctors < patients) {
                untreatedPatients +=Math.abs(countDoctors-patients);
                treatedPatientsCount += countDoctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatientsCount);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
