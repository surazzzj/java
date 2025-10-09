import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

    public static int[] newArray(int[] arr1) {
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        return arr2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of Array:");
        int size = input.nextInt();
        int[] arr1 = new int[size];

        System.out.println("Enter elements in an array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = input.nextInt();
        }

        int[] result = newArray(arr1);
        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Copied Array: " + Arrays.toString(result));

    }
}
