import java.util.Scanner;

public class SecondSmallestInArray {

    public static void findSecondSmallest(int array[]) {
        int smallest = array[0];
        int secondSmallest = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }
        System.out.println("Smallest elem in array:" + smallest);
        System.out.println("secondSmallest elem in array:" + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        findSecondSmallest(arr);
    }
}
