import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
public class Main {


    public static void main(String[] args) {

        int day1    = 0;
        int month1  = 0;
        int year1   = 0;
        int day2    = 0;
        int month2  = 0;
        int year2   = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter a day between 1 and 31: ");
        day1 = scnr.nextInt();

        System.out.println("Please enter a month in numerical format: ");
        month1 = scnr.nextInt();

        System.out.println("Please enter a year between 1000 and 2017: ");
        year1 = scnr.nextInt();

        System.out.println("Please enter a second day between 1 and 31: ");
        day2 = scnr.nextInt();

        System.out.println("Please enter a second month in numerical formal: ");
        month2 = scnr.nextInt();

        System.out.println("Please enter a second year between 1000 and 2017: ");
        year2 = scnr.nextInt();

        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);

        Period period = Period.between(date1,date2);

        System.out.println("There are " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days between your 2 dates.");
    }
}
