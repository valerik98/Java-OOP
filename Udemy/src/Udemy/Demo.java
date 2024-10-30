package Udemy;

public class Demo {
    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static void main(String[] args) {
        int a = calculateScore("Valeri",100);
        //purvo smqta tochkite sys 100 i sled kato mine sout i chete sledvashtiq red no nie veche sme printirali
        // zatova kato izvikame a sledtova izvejda tochktie*1000.

        System.out.println(a);

    }
}
