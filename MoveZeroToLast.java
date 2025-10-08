import java.util.Scanner;

public class MoveZeroToLast {

    public static void moveZeroToLast(int array[]) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }

        while (index < array.length) {
            array[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter values of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroToLast(arr);

        for(int value:arr){
            System.out.println(value + "\t");
        }
        System.out.println();
    }
}
