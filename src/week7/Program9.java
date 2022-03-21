package week7;
// program-8 using switch statement
import java.util.Scanner;

public class Program9 {
    //main method
    public static void main(String[] args) {
        char ch;
        Scanner s2=new Scanner(System.in);//user to enter input
        System.out.println("Enter alphabet:");
        ch=s2.next().charAt(0);
        Program9.alphabets(ch);//calling static method with class name
    }
    //static method with datatype with parameter
    public static char alphabets(char ch){
//swith case statements to implement condition
               switch (ch){
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'b':
                System.out.println("Baroda");
                break;

            case 'c':
                System.out.println("Calcutta");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'e':
                System.out.println("Ealing");
                break;
            case 'f':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");

        }
        return ch;
    }
}