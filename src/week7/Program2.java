package week7;

import java.util.Scanner;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
//main method
public class Program2 {

    public static void main(String[] args) {
        Program2 obj = new Program2();//create object to call instance method
        obj.leapyear();

    }

    //instance mehtod with return type without any parameter
    public int leapyear() {
        int year;
        boolean b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year:");
        int y = sc.nextInt();
        if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))//formula to calculate leap year
            System.out.println("This is Leap year");
        else
            System.out.println("This is not a Leap year");


        return y;
    }

}

