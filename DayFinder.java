import java.util.Scanner;

public class DayFinder {

    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter day from 1 - 7: ");
        int day = scan.nextInt();

        Days selectedDay;

        switch (day) {

            case 1:
                selectedDay = Days.SUNDAY;
                break;

            case 2:
                selectedDay = Days.MONDAY;
                break;

            case 3:
                selectedDay = Days.TUESDAY;
                break;

            case 4:
                selectedDay = Days.WEDNESDAY;
                break;

            case 5:
                selectedDay = Days.THURSDAY;
                break;

            case 6:
                selectedDay = Days.FRIDAY;
                break;

            case 7:
                selectedDay = Days.SATURDAY;
                break;

            default:
                System.out.println("Invalid day. Enter a number from 1 to 7.");
                scan.close();
                return;
        }

        System.out.printf("The day you entered is %s%n", selectedDay);

        scan.close();
    }
}
