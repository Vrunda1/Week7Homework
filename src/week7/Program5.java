package week7;
//input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
// HRA = basic salary 10%
// DA = Basic salary 8%
// TA = Basic salary 9%
// PF= Basic salary 20%
// Gross salary = basic salary + HRA + TA + DA –PF

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;

public class Program5 {
    //main method
    public static void main(String[] args) {
        Program5.tree();//call static method by class name
    }

    //static method
    public static void tree() {
        Scanner job = new Scanner(System.in);
        System.out.println("Enter Employee ID");//Employee ID
        int id = job.nextInt();

        System.out.println("Enter Employee name:");
        String en = job.next();//Name

        System.out.println("Enter basic salary:");
        float Basicsalary = job.nextFloat();//basic salary

        float HRA = (Basicsalary * 0.10f);

        float DA = (Basicsalary * 0.08f);
        float TA = (Basicsalary * 0.09f);
        float PF = (Basicsalary * 0.20f);
        float Grosssalary = (Basicsalary + HRA + TA + DA - PF);
        System.out.println("|-----------------------------------------------|");
        System.out.println("|        Salary Slip                            |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|  Employee Id   :       " + id + "                |");//105
        System.out.println("|  Employee Name :     " + en + "                  |");//Ms.Claire
        System.out.println("|---------------------------------------------- |");//
        System.out.println("|  Basic Salary  :     " + Basicsalary + "         |");//10000
        System.out.println("|  HRA 10%       :     " + HRA + "                 |");//1000
        System.out.println("|  TA   8%       :     " + TA + "                 |");//900.00
        System.out.println("|  DA   9%       :     " + DA + "                  |");//800
        System.out.println("|  PF -20%&      :    " + PF + "                   |");//2000
        System.out.println("|---------------------------------------------- |");
        System.out.println("| Gross Salary   :    " + Grosssalary + "          |");//10700
        System.out.println("|---------------------------------------------- |");
        System.out.println("|---------------------------------------------- |");

    }

    // public static float Salaryslip(float f) {
    //  float Grosssalary=Basicsalary


}
