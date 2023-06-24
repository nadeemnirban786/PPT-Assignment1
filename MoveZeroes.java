/*Q7 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.
Note that you must do this in-place without making a copy of the array.
Example 
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]/* */

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writePointer] = nums[i];
                writePointer++;
            }
        }

        // Fill the remaining elements with zeroes
        while (writePointer < nums.length) {
            nums[writePointer] = 0;
            writePointer++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };

        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(nums);

        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
