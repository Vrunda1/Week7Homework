package week7;

import java.util.Scanner;

//input value is number or an alphabet or symbol.
public class Program12 {
    //main method
    public static void main(String[] args) {
        Program12 obj12 = new Program12();
        obj12.num();//call instance method by object

    }

    //instance method
    public void num() {
        char n;

        System.out.println("Enter any input ");
        Scanner scope = new Scanner(System.in);
        n = scope.next().charAt(0);

        if (n >= '0' && n <= '9') {
            System.out.println("This is number");
        } else if ((n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z')) {
            System.out.println("This is alphabet");
        } else
            System.out.println("This is a symbol");
    }

}

