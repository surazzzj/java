package practice;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void countEvenOdd(int array[]) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
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

        countEvenOdd(arr);
    }
}
