package week7;
//Calculator

import java.util.Scanner;

public class Program10 {
    //main method
    public static void main(String[] args) {
        Program10.calculator();//call static method with class name
    }

    //static method
    public static void calculator() {
        Scanner calc = new Scanner(System.in);//take input from user
        System.out.println("Enter first number :");//
        double a = calc.nextDouble();
        System.out.println("Enter +for additon,-for substraction");//ask user for type of calculation
        char c = calc.next().charAt(0);
        System.out.println("Enter second number:");
        double b = calc.nextDouble();
        double d = a + b;//addition
        double e = a - b;//substraction
        double f = a * b;//multiplication
        double g = a / b;//division

        if (c == '+') {
            System.out.println("Addition of " + a + "  and " + b + " is  :" + d);
        } else if (c == '-') {
            System.out.println("Substraction of " + a + "  and " + b + " is :" + e);
        } else if (c == '*') {
            System.out.println("Multiplication of " + a + "  and  " + b + " is :" + f);
        } else if (c == '/') {
            System.out.println("Division of " + a + "  and  " + b + " is   :" + g);
        } else {
            System.out.println("Invalid input");

        }
    }
}






