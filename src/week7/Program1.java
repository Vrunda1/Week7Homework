package week7;
//Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)

import java.util.Scanner;

public class Program1 {
    //main method
    public static void main(String[] args) {
        Program1 ob = new Program1();//create object to call instance method
        ob.oddeven();
    }

    //instance method
    public void oddeven() {
        int a;
        Scanner sc1 = new Scanner(System.in);//ask for user to give input
        System.out.println("Enter any number :");
        a = sc1.nextInt();
        String r = a % 2 == 0 ? "Even" : "odd";//ternary operator
        System.out.println(a + " is " + r);
    }


}

