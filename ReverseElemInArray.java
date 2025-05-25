package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElemInArray {

    public static int[] reverseElemArray(int array[]) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        return array;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = reverseElemArray(arr);
           
        // To print array contents nicely
        System.out.println("Reversed array: " + Arrays.toString(result));
    }
}
