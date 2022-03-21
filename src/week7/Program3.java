package week7;
//print Mark Sheet in following format
import java.util.Scanner;

public class Program3 {
    //main method
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);//scanner to take input from user
        System.out.println("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Roll Number :");
        int rollno = sc.nextInt();

        System.out.println("Enter the markks of Maths :");
        int marksmath = sc.nextInt();

        System.out.println("Enter the markks of Science :");
        int markssci = sc.nextInt();

        System.out.println("Enter the markks of English :");
        int markseng = sc.nextInt();

        if (marksmath <= 0 || marksmath > 100) {
            System.out.println("Invalid input");
        } else if (markssci <= 0 || markssci > 100) {
            System.out.println("Invalid input");
        } else if (markseng <= 0 || markseng > 100) {
            System.out.println("Invalid input");
        } else {
            int total = (marksmath + markssci + markseng);//calculate total marks

        }

        int total = (marksmath + markssci + markseng);
        int percent = ((total *100) / 300);
        Program3.grade1(percent);//call static mathod by using class name
        Program3.result1(percent);//call static mathod by using class name
        System.out.println("------------------------------------------- |");
        System.out.println("----------------Mark Sheet------------------|");
        System.out.println("                                            |");
        System.out.println("--------------------------------------------|");
        System.out.println("Name              :" + name + "                 |");//John
        System.out.println("  Roll No         :" + rollno + "               |");//15
        System.out.println("--------------------------------------------|");
        System.out.println(" Subjects         :              Marks      |");
        System.out.println("--------------------------------------------|");
        System.out.println("Science           :         " + markssci + "|");//70
        System.out.println("English           :         " + markseng + "|");//83
        System.out.println("English           :        " + marksmath + "|");//80
        System.out.println("---------------------------------------------|");
        System.out.println(" Total            :          " + total + "   |");//233

        System.out.println("---------------------------------------------|");
        System.out.println("Percentage         :          " + percent + "|");//77
        System.out.println("Result             :   "+ result1(percent)+ "|");//pass
        System.out.println("Grade              :   "+ grade1(percent) +" |");//A


    }
//static method with return type,with parameter
    public static String grade1(int a) {
        String grade;
        if (a >= 80) {
            grade = "A+";
        } else if (a >= 60 && a<80) {
            grade = "A";
        } else if (a >= 50 && a<60) {
            grade = "B";
        } else if (a >= 35 && a<50) {
            grade = "C";
        } else  {
            grade = "Pass";
        }

        return grade;//grade
    }
//static method with return type,with parameter
    public static String result1(int a) {
        String result;
        if (a >= 35) {
            result = "Pass";
        } else
            result = "Fail";
        return result;//pass/fail
    }
}
