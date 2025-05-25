package practice;

import java.util.Scanner;

public class checkArraySorted {
    public static boolean checkArrSorted(int array[]) {
      for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; // found out of order
            }
        }
        return true; // no violations found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter values in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = checkArrSorted(arr);
           if (result) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
