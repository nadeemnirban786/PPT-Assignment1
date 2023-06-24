/*Q8 You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example
Input: nums = [1,2,2,4]
Output: [2,3]/* */

import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;

        // Find the duplicate number
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result[0] = Math.abs(nums[i]);
            } else {
                nums[index] = -nums[index];
            }
        }

        // Find the missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };

        SetMismatch solution = new SetMismatch();
        int[] result = solution.findErrorNums(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
