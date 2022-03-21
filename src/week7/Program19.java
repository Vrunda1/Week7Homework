package week7;

//calculate the average value of array elements.
public class Program19 {
    //main method
    public static void main(String[] args) {
        Program19.avgArray();//call static mehtod with class
    }

    //static method
    public static void avgArray() {
        int number[] = {10, 20, 30, 40};//single dimension array
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        double avg = sum / number.length;//calculates the average of array
        System.out.println("The average value of given array is:" + sum);
        System.out.println("The average value of given array is:" + avg);
    }
}
