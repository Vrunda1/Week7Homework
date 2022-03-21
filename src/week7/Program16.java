package week7;
//check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Program16 {
    //main method
    public static void main(String[] args) {
        Program16.number();//call static method with class

    }

    //static method
    public static int number() {
        int n1;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter any number");
        n1 = sc2.nextInt();
        if (n1 > 0) {
            System.out.println(n1 + " ia a positive number");
        } else if (n1 < 0) {
            System.out.println(n1 + " is a negative number ");
        } else {
            System.out.println(n1 + "is zero");
        }
        return n1;
    }
}

