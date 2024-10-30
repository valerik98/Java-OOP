package ConditionalStatementsExercise;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Дадено е цяло число – начален брой точки.
        int beginningScorePoints = Integer.parseInt (scanner.nextLine());
        double bonusPoints = 0;
        double extraBonusPoints = 0;
        // Върху него се начисляват бонус точки по правилата, описани по-долу.
        //· Ако числото е до 100 включително, бонус точките са 5.
        if (beginningScorePoints<=100){
            bonusPoints = 5;
        } else if (beginningScorePoints>1000){ //· Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
            bonusPoints = beginningScorePoints*0.1;
        } else { //· Ако числото е по-голямо от 100, бонус точките са 20% от числото.
            bonusPoints = beginningScorePoints*0.2;
        }
        //· Допълнителни бонус точки (начисляват се отделно от предходните):
        //o За четно число à + 1 т.
        if (beginningScorePoints%2==0){
            extraBonusPoints = 1;
        }else if (beginningScorePoints%10==5){
            extraBonusPoints = 2;
        }
        //o За число, което завършва на 5 à + 2 т
        // Да се напише програма, която пресмята бонус точките,
        // които получава числото и общия брой точки (числото + бонуса).
        double totalBonusPoints = bonusPoints+extraBonusPoints;
        double totalScorePoints = beginningScorePoints+bonusPoints+extraBonusPoints;
        System.out.println(totalBonusPoints);
        System.out.println(totalScorePoints);
    }
}
