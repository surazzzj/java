package practice;

import java.util.Scanner;

public class SumOfArrayElems {

    public static int arraySum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
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

        int result = arraySum(arr);
        System.out.println("Sum:" + result);
    }
}
