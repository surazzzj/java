import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortArray {

    public static int RemoveDuplicates(int[] arr) {
        if (arr.length == 0)
            return 0;

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter values in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (!isSorted) {
            System.out.println("⚠️ Array is not sorted! Please enter sorted numbers.");
        } else {
            System.out.println("Original array: " + Arrays.toString(arr));
        }

        int newLength = RemoveDuplicates(arr);

        System.out.print("Array after removing duplicates: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}



