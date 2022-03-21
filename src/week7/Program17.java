package week7;
//o sort a numeric array and a string array.

import java.util.Arrays;

public class Program17 {
    //main method
    public static void main(String[] args) {
        Program17.arraySort();//call static array with class

    }

    //define static array
    public static void arraySort() {
        int[] arrray1 = {
                2001, 1995, 2004, 1985,
                1984, 2003, 1980, 2005,
                1982, 2015, 2022, 1998};
        String[] array2 = {
                "Maths", "English", "Science",
                "Geography", "History", "Language"

        };
        System.out.println("Original numeric array : " + Arrays.toString(arrray1));//input of given Array
        Arrays.sort(arrray1);
        System.out.println("Sorted numeric array : " + Arrays.toString(array2));//sorting list of given Array

        System.out.println("Original string array : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : " + Arrays.toString(array2));

    }

}
