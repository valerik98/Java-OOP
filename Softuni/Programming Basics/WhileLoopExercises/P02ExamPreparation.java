package WhileLoopExercises;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBadResultsAllowed = Integer.parseInt(scanner.nextLine());
        int solvedProblemsCounter = 0;
        int failedTimesCounter = 0;
        int gradesSum = 0;
        String lastProblem = "";
        boolean isFailed=true;

        while (countBadResultsAllowed>failedTimesCounter){
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt (scanner.nextLine());
            if (grade<=4){
                failedTimesCounter++;
            }
            gradesSum += grade;
            solvedProblemsCounter++;
            lastProblem = problemName;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.",failedTimesCounter);
        } else {
            double avgGrade = gradesSum*1.0/solvedProblemsCounter;
            System.out.printf("Average score: %.2f%n",avgGrade);
            System.out.printf("Number of problems: %d%n",solvedProblemsCounter);
            System.out.printf("Last problem: %s",lastProblem);
        }



    }
}
