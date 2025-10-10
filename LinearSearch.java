import java.util.Scanner;

public class LinearSearch {

    public static void linearSearch(int[] arr, int key) {

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(key + " Not found ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter values in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int key = sc.nextInt();

        linearSearch(arr, key);
        sc.close();
    }
}
