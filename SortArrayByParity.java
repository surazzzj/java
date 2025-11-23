// Sort Array By Parity

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayParity(int[] nums) {
        int[] res = new int[nums.length];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[idx] = nums[i];
                idx++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                res[idx] = nums[i];
                idx++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int[] result = sortArrayParity(nums);

        System.out.print("Sorted array: " + Arrays.toString(result));
    }
}
