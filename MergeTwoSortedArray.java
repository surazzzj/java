package practice;

import java.util.Scanner;

public class MergeTwoSortedArray {

    public static void mergeArray(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int merged[] = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements (if any)
        while (i < n) {
            merged[k++] = arr1[i++];
        }
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        // Print the merged array
        System.out.println("Merged Sorted Array:");
        for (int x : merged) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 array size:");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];

        System.out.println("Enter values in 1 array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter 2 array size:");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];

        System.out.println("Enter values in 2 array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        mergeArray(arr1, arr2);
    }
}
