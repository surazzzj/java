import java.util.Scanner;

public class CountOccurenceElements {

    public static int countTargetElement(int target, int array[]) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int count = countTargetElement(target, arr);
        System.out.println("Target element count:" + count);
    }
}
