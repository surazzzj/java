package practice;

import java.util.Scanner;

public class printAlternateElems {

    public static void printAltElems(int array[]) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }

            System.out.println();
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

        printAltElems(arr);
    }
}
