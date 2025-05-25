package practice;

import java.util.Scanner;

public class SecondLargestInArray {

    public static void findSecondLargest(int array[]) {
        int largest = array[0];
        int secondLargest = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest=largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Largest elem in array:" + largest);
        System.out.println("secondLargest elem in array:" + secondLargest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        findSecondLargest(arr);
    }
}
