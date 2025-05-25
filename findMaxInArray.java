package practice;
import java.util.*;

public class findMaxInArray {

    public static int findMax(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
        return max;
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

        int maxElem = findMax(arr);
        System.out.println("Max element in array is:" + maxElem);
    }
}
