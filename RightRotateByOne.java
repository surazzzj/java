import java.util.Scanner;

public class RightRotateByOne {

    public static int[] rightRotateByOne(int array[]) {
        if (array.length == 0) {
            return array;
        }

        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;

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

        int result[] = rightRotateByOne(arr);
        System.out.println("Array right rotate by one");
        for (int val : result) {
            System.out.println(val);
        }
    }
}
