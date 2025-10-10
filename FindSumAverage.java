import java.util.Scanner;

public class FindSumAverage {

    public static void sumAverageArray(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        double avg = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sumAverageArray(arr);
        sc.close();

    }
}
