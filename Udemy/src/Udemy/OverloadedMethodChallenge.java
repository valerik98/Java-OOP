package Udemy;

public class OverloadedMethodChallenge {
    public static double convertToCm(int heightInInches) {
        return (heightInInches * 2.54);

    }

    public static double convertToCm(int feet, int inches) {
        return convertToCm((feet * 12 + inches));

    }

    public static void main(String[] args) {
        System.out.println(convertToCm(5,7));
    }
}
