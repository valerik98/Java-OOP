package Udemy;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3965));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("invalid value");
            return "";
        }
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            System.out.println("invalid value");
            return "";
        }
        if (seconds <= 0 || seconds > 59) {
            System.out.println("invalid value");
            return "";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        System.out.println(hours + "h" + remainingMinutes + "m" + remainingSeconds + "s");
        return "";
    }

}
