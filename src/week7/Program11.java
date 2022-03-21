package week7;

//o print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
public class Program11 {
    //main method
    public static void main(String[] args) {
        Program11.divby();//call static method with class
    }

    //static method
    public static void divby() {
        System.out.println("\nDivided by 3:");//output of numbers  divisible by 3
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");
        }
        System.out.println("\n\nDivided by 5:");////output of numbers  divisible by 3
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");
        }
        System.out.println("\n");
    }
}
