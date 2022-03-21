package week7;
/*input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class Program7 {
    //main method
    public static void main(String[] args) {
    Program7.sales();//call static method by class
    }
//static mehhod
    public static void sales() {
        Scanner sale = new Scanner(System.in);

        System.out.println("Enter Sales ID");//Employee ID
        int saleId = sale.nextInt();

        System.out.println("Enter Seller's name:");
        String sn = sale.next();//Name

        System.out.println("Enter Sales Amount:");
        float sa = sale.nextFloat();//basic salary

        System.out.println("Enter Basic Amount:");
        float ba = sale.nextFloat();//basic salary
//nested if else condition to calculate commission
        float commision;
        if (sa >= 50000) {
            commision = sa * 0.35f;
        } else if (sa >= 30000) {
            commision = sa * 0.20f;
        } else if (sa >= 20000) {
            commision = sa * 0.10f;
        } else if (sa >= 10000) {
            commision = sa * 0.05f;
        } else if (sa < 20000) {
            commision = sa * 0.02f;

        } else
            commision = 0;
        System.out.println("Commission of this employee is: "+commision);


    }
}
