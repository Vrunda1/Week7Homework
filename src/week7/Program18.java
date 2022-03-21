package week7;

//sum values of an array
public class Program18 {
    static int array12[] = {10, 20, 30, 40, 50};

    //main method
    public static void main(String[] args) {


        int sum = 0;
        for (int i = 0; i < array12.length; i++) //for loop to take number and increase as per array length
        {
            sum = sum + array12[i];

        }
        System.out.println("The sum is " + sum);//sum of the array
    }
}