package practice;
import java.util.*;

public class FindMinInArray {

    public static int findMin(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
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

        int maxElem = findMin(arr);
        System.out.println("Min element in array is:" + maxElem);
    }
}
