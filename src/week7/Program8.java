package week7;
/*alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Program8 {
    //main method
    public static void main(String[] args) {
        char x;
        Scanner c = new Scanner(System.in);//user to enter input
        System.out.println("Enter any character :");
        x = c.next().charAt(0);
        Program8 object1 = new Program8();//call instance method by object
        object1.alpha(x);

    }

    //Instance method with datatype,with parameter
    public char alpha(char x) {

        if (x == 'a' || x == 'A') {
            System.out.println("Ahmedabad");
        } else if (x == 'b' || x == 'B') {
            System.out.println("Baroda");
        } else if (x == 'c' || x == 'C') {
            System.out.println("Calcutta");
        } else if (x == 'd' || x == 'D') {
            System.out.println("Delhi");
        } else if (x == 'e' || x == 'E') {
            System.out.println("Ealing");
        } else if (x == 'f' || x == 'F') {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid Entry");

        }


        return x;
    }

}





        
                
                

