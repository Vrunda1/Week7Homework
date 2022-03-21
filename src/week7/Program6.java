package week7;
//to input any number and find out if it’s odd or even
import java.util.Scanner;

public class Program6 {
    //main method
    public static void main(String[] args) {
      Program6 obj12=new Program6();//call instance method by object
      obj12.test();
    }
//instaance method
    public void test() {
        int o;
        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter any number");
        o = o1.nextInt();
        if (o % 2 == 0)
            System.out.println("This is Even number");//even numbers
        else
            System.out.println("This is odd number");//odd numbers
         }

}


