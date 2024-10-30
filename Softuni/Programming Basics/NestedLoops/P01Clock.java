package NestedLoops;

public class P01Clock {
    public static void main(String[] args) {
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59 ; m++) {
                System.out.printf("%d:%d",h,m);
                System.out.println();
            }
        }
    }
}
