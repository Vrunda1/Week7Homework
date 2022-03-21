package week7;

import java.util.Scanner;

/*input any number between 1 to 7 and it print The Days name MONDAY, TUESDAY…..SUNDAY
of the week accordingly by using switch.*/
public class Program13 {
    public static void main(String[] args) {
        Program13.week();//call static mehtod with class
    }

    //static method
    public static void week() {
        int day = 7;

        Scanner t = new Scanner(System.in);
        System.out.println("Enter any number to get the days in a week:");
        day = t.nextInt();
//print days according to user input number
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}