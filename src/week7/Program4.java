package week7;

import java.util.Scanner;

public class Program4 {
    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any year:");
        int a = scan.nextInt();
        isLeapYear(a);
        System.out.println("Enter month:");
        int b = scan.nextInt();
        System.out.println(getDaysInMonth(b, a) + " " + "days in a" + " " + a + "year");

    }
    // should return 29 since February has 29 days in a year and 2020 is a leap
// year

    //method isLeapYear with a parameter of type int named year.
    //static method with return type,with parameter
    public static int isLeapYear(int year) {
        int y = year;

//return false since the parameter is not in the range(1-9999)

        if (((year >= 1 && year <= 9999) && (year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(" This return true since " + year + "  is a leap year");

        else
            System.out.println("this return false since " + year + "is not in the range(1-9999)");


        return y;
    }

    //static method with return type with parameter
    public static int getDaysInMonth(int month, int year) {

        int daysInMonth = 0;//switch method to implement condition
        switch (month) {
            case 1://Jan
            case 3://Mar
            case 5://May
            case 7://July
            case 8://August
            case 10://October
            case 12://December
                daysInMonth = 31;
                break;
            case 4://April
            case 6://June
            case 9://September
            case 11://November
                daysInMonth = 30;
                break;
            case 2://February
                if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))) {
                    daysInMonth = 29;

                } else
                    daysInMonth = 28;
                break;
            default:
                System.out.println("Is not a valid entry :return -1");
                break;
        }
        return daysInMonth;
    }
}



