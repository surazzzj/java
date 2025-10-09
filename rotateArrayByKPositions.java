package practice;

import java.util.Arrays;

public class rotateArrayByKPositions {

    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;        // Handle cases where k > n
        reverse(nums, 0, n - 1);      // Step 1: Reverse the whole array
        reverse(nums, 0, k - 1);      // Step 2: Reverse first k elements
        reverse(nums, k, n - 1);            // Step 3: Reverse remaining n-k elements
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    public static void reverse(int[] nums, int start, int end) {      // reverse function
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
