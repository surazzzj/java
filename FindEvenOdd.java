import java.util.Arrays;
import java.util.Scanner;

public class FindEvenOdd {

    public static void findEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[evenIndex] = arr[i];
                evenIndex++;
            } else {
                odd[oddIndex] = arr[i];
                oddIndex++;
            }
        }

        System.out.println("Even numbers (" + evenCount + "): " + Arrays.toString(even));
        System.out.println("Odd numbers (" + oddCount + "): " + Arrays.toString(odd));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size:");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        findEvenOdd(arr);
    }

}
