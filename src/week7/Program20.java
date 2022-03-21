package week7;

// test if an array contains a specific value
public class Program20 {
    //main method
    public static void main(String[] args) {
        int[] n = {1, 5, 4, 8, 10, 2, 3};//single dimension array
        int tofind = 4;
        boolean found = false;
        for (int i : n) {
            if (i == tofind) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(tofind + " is found.");
        else
            System.out.println(tofind + " is not found.");
    }
}