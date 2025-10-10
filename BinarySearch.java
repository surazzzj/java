import java.util.Scanner;

public class BinarySearch {

    public static void binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println(target + " element found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println(target + " not found in array.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target element:");
        int target = sc.nextInt();

        binarySearch(arr, target);
        sc.close();

    }
}
