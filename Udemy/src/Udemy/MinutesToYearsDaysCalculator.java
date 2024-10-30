package Udemy;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long days, years, hours;
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        //1 hour = 60 minutes
        //
        //1 day = 24 hours
        //
        //1 year = 365 days
        hours = minutes / 60;
        days = hours / 24;
        years = days / 365;
        long daysLeft = days - years*365;
        System.out.printf("%d min = %d y and %d d", minutes, years, daysLeft);

    }
}
