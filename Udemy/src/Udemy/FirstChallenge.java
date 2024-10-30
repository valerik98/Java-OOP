package Udemy;

public class FirstChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePoints(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePoints(1000);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePoints(500);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePoints(100);
        displayHighScorePosition("Jake", highScorePosition);
        highScorePosition = calculateHighScorePoints(25);
        displayHighScorePosition("Josh", highScorePosition);
    }

    public static void displayHighScorePosition(String playersName, int highScorePosition) {

        //must print message as "Tim managed to get into position 2 on the high score list"
        System.out.println(playersName + " managed to get into position " + highScorePosition + " on the high score list");

    }

    public static int calculateHighScorePoints(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;

    }

}
