import java.util.Scanner;

public class LeftRotateByOneArray {

    public static int[] leftRotateElem(int array[]) {
        if (array.length == 0)
            return array; // Check for empty array

        int first = array[0]; // Store the first element

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // Put the first element at the end
        array[array.length - 1] = first;

        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the element in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = leftRotateElem(arr);
        System.out.println("Array after left rotation by one:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}