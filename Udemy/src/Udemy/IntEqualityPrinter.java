package Udemy;

public class IntEqualityPrinter {
    public static void printEqual(int a, int b,int c){
        if(a<0||b<0||c<0){
            System.out.println("Invalid Value");
            return;
        } else if (a==b && b==c) {
            System.out.println("All numbers are equal");
            return;
        } else if (a!=b && b!=c && c!=a) {
            System.out.println("All numbers are different");
            return;
        } else {
            System.out.println("Neither all are equal or different");
            return;
        }
    }
}
