package assortedTutorials;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class CArrayTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] floatNumbers;
        floatNumbers = new float[] { 1.02f, 0.03f, 4f };
        System.out.println(Arrays.toString(floatNumbers));


        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 6;
        n = arr[arr[n]];
        System.out.println(n);

        System.out.println('\t'); // makes a tab
        System.out.println('a');

        int size = 10;
        char[] characters = new char[size];

        // It takes an array, start index, end index (exclusive) and the value for filling the array
        Arrays.fill(characters, 0, size / 3, 'A');
        Arrays.fill(characters, size / 4, size, 'B');

        System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]

    }
}
