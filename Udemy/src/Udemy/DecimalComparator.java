package Udemy;

public class DecimalComparator {
    public static boolean  areEqualByThreeDecimalPlaces (double number1, double number2){
        long num1=(long)(number1*1000);
        long num2=(long)(number2*1000);

        return num1==num2;
    }
}
